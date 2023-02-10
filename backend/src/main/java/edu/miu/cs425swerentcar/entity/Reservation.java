package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private LocalDate startDate;
    private LocalDate returnDate;
    private double insuranceCharge;
    private String status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Vehicle vehicle;
}
