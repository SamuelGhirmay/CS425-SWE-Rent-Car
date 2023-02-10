package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservation();
    Reservation createReservation(Reservation reservation);
    void cancelReservationById( Long reservationId);
    Optional<Reservation> viewReservationById(Long reservationId);

}
