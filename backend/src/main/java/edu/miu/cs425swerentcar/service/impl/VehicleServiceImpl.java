package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.dto.VehicleRequest;
import edu.miu.cs425swerentcar.entity.Vehicle;
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
    public List<Vehicle> getAvailableVehicles() {
        return vehicleRepository.getVehicleByAvailability(true);
    }

    @Override
    public Vehicle updateVehicleById(VehicleRequest vehicleRequest, Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
        if(vehicle != null) {
            vehicle.setMake(vehicleRequest.getMake());
            vehicle.setModel(vehicleRequest.getModel());
            vehicle.setYear(vehicleRequest.getYear());
            vehicle.setColor(vehicleRequest.getColor());
            vehicle.setNumberOfSeats(vehicleRequest.getNumberOfSeats());
            vehicle.setPrice(vehicleRequest.getPrice());
            vehicle.setAvailability(vehicleRequest.isAvailability());
            vehicle.setPlateNumber(vehicleRequest.getPlateNumber());
            vehicle.setTransmission(vehicleRequest.getTransmission());
            vehicle.setFuelType(vehicleRequest.getFuelType());
            return vehicleRepository.save(vehicle);
        }

        return null;
    }

    @Override
    public Vehicle addNewVehicle(VehicleRequest vehicle) {
        Vehicle newVehicle = new Vehicle(null,vehicle.getMake(),
                vehicle.getModel(),vehicle.getYear(),vehicle.getColor(),vehicle.getNumberOfSeats(),
                vehicle.getPrice(),vehicle.isAvailability(),vehicle.getPlateNumber(),vehicle.getTransmission(),
                vehicle.getFuelType());
        return vehicleRepository.save(newVehicle);
    }

    @Override
    public void deleteById(Long vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }
}
