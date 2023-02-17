package edu.miu.cs425swerentcar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.entity.Payment;
import edu.miu.cs425swerentcar.entity.Vehicle;
import edu.miu.cs425swerentcar.enums.ReservationStatus;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ReservationRequest {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime returnDate;
    private ReservationStatus status;
    private Long customerId;
    private Long vehicleId;
}
