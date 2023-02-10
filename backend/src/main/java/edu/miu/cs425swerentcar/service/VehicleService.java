package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.VehicleRequest;
import edu.miu.cs425swerentcar.entity.Vehicle;
import edu.miu.cs425swerentcar.entity.VehicleStatus;
import edu.miu.cs425swerentcar.exception.VehicleNotFoundException;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    List<Vehicle> getAllVehicle();
    Vehicle getVehicleById(Long vehicleId) throws VehicleNotFoundException;
    List<Vehicle> getVehicleByModel(String model);
    List<Vehicle> getVehicleByPrice(double price);
    List<Vehicle> getVehicleByTransmission(String transmission);
    Vehicle updateVehicleById(VehicleRequest vehicle, Long vehicleId);
    Vehicle addNewVehicle(Vehicle vehicle);
    void deleteById(Long vehicleId);

    void updateVehicleStatus(Long vehicleId, VehicleStatus vehicleStatus);

}
