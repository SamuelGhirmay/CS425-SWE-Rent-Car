package edu.miu.cs425swerentcar.repository;

import edu.miu.cs425swerentcar.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    List<Vehicle> getVehicleByTransmission(String transmission);

    List<Vehicle> getVehiclesByModel(String model);

    List<Vehicle> getVehiclesByPrice(double price);
}
