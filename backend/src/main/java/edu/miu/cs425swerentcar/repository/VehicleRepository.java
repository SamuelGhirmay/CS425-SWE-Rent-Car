package edu.miu.cs425swerentcar.repository;

import edu.miu.cs425swerentcar.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

<<<<<<< HEAD
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    List<Vehicle> getVehicleByTransmission(String transmission);

    List<Vehicle> getVehiclesByModel(String model);

    List<Vehicle> getVehiclesByPrice(double price);
=======
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> getVehiclesByModel(String model);

    List<Vehicle> getVehiclesByPrice(double price);

    List<Vehicle> getVehicleByAvailability(Boolean availability);
>>>>>>> f7f60b61e8f85b71bbc4213e1dbaf0a2c59708c7
}
