package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.dto.VehicleRequest;
import edu.miu.cs425swerentcar.entity.Vehicle;
import edu.miu.cs425swerentcar.entity.VehicleStatus;
import edu.miu.cs425swerentcar.exception.VehicleNotFoundException;
import edu.miu.cs425swerentcar.repository.VehicleRepository;
import edu.miu.cs425swerentcar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(Long vehicleId) throws VehicleNotFoundException {
        return vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new VehicleNotFoundException((String.format("Vehicle with Id: %d is not found"))));
    }

    @Override
    public List<Vehicle> getVehicleByModel(String model) {
        return vehicleRepository.getVehiclesByModel(model);
    }

    @Override
    public List<Vehicle> getVehicleByPrice(double price) {
        return vehicleRepository.getVehiclesByPrice(price);
    }

    @Override
    public List<Vehicle> getVehicleByTransmission(String transmission) {
        return vehicleRepository.getVehicleByTransmission(transmission);
    }

    @Override
    public Vehicle updateVehicleById(VehicleRequest vehicle, Long vehicleId) {
        Vehicle updatedVehicle = Vehicle.build(vehicleId, vehicle.getMake(), vehicle.getModel(), vehicle.getYear(), vehicle.getColor(), vehicle.getNumberOfSeats(),
                vehicle.getFuelType(), vehicle.getPrice(), vehicle.getTransmission(), vehicle.getVehicleStatus(), vehicle.getPlateNumber(), vehicle.getDiscount());
        return vehicleRepository.save(updatedVehicle);
    }

    @Override
    public Vehicle addNewVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteById(Long vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }

    @Override
    public void updateVehicleStatus(Long vehicleId, VehicleStatus vehicleStatus) {
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(vehicleId);
        if (vehicleOptional.isPresent()) {
            vehicleOptional.get().setVehicleStatus(vehicleStatus);
            vehicleRepository.save(vehicleOptional.get());
        }


    }
}
