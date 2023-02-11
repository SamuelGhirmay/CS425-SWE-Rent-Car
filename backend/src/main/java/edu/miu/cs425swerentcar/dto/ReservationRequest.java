package edu.miu.cs425swerentcar.dto;

import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.entity.Payment;
import edu.miu.cs425swerentcar.entity.Vehicle;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ReservationRequest {

    private LocalDate startDate;
    private LocalDate returnDate;
    private double insuranceCharge;
    private String status;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    private Long customerId;

    private Long vehicleId;

    private Long paymentId;
}
