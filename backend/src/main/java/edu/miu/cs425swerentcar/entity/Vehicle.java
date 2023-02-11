package edu.miu.cs425swerentcar.entity;

import edu.miu.cs425swerentcar.enums.VehicleFuelType;
import edu.miu.cs425swerentcar.enums.VehicleTransmission;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "color")
    private String color;

    private int numberOfSeats;

    private double price;

    private boolean availability;

    private String plateNumber;

    private VehicleTransmission transmission;

    private VehicleFuelType fuelType;


}
