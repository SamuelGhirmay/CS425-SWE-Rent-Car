package edu.miu.cs425swerentcar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class DiscountRequest {
    private double amount;

    private String currency;

    private String description;

    private String title;
}
