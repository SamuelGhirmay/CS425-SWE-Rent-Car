package edu.miu.cs425swerentcar.dto;

import edu.miu.cs425swerentcar.entity.Discount;
import edu.miu.cs425swerentcar.entity.VehicleStatus;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class VehicleRequest {
    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "color")
    private String color;

    private int numberOfSeats;

    private String fuelType;

    private double price;

    private String transmission;

    private VehicleStatus vehicleStatus;

    private String plateNumber;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;
}
