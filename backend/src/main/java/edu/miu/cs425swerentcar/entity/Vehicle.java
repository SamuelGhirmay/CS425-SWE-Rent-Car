package edu.miu.cs425swerentcar.entity;

import edu.miu.cs425swerentcar.enums.VehicleFuelType;
import edu.miu.cs425swerentcar.enums.VehicleTransmission;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private String make;

    private String model;

    private Integer year;

    private String color;

    private Integer numberOfSeats;

    private double price;

    private Boolean availability;

    private String plateNumber;

    @Enumerated(EnumType.STRING)
    private VehicleTransmission transmission;

    @Enumerated(EnumType.STRING)
    private VehicleFuelType fuelType;
}
