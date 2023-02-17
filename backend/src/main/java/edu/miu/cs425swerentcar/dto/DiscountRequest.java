package edu.miu.cs425swerentcar.dto;

import edu.miu.cs425swerentcar.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class DiscountRequest {
    private double percentage;
    private String code;
    private String description;
    private String title;
    private String vehicleMake;
}
