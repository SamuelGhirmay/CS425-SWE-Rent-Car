package edu.miu.cs425swerentcar.dto;

import edu.miu.cs425swerentcar.entity.Discount;
import edu.miu.cs425swerentcar.enums.VehicleFuelType;
import edu.miu.cs425swerentcar.enums.VehicleTransmission;
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

    private String make;

    private String model;

    private int year;

    private String color;

    private int numberOfSeats;

    private double price;

    private VehicleTransmission transmission;

    private VehicleFuelType fuelType;

    private boolean available;

    private String plateNumber;

    private Long discountId;
}
