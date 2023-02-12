package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.UpdateReservationRequest;
import edu.miu.cs425swerentcar.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservations();
    List<Reservation> getReservationsByCustomerId(Long customerId);
    Reservation createReservation(Reservation reservation);
    void cancelReservationById( Long reservationId);
    Optional<Reservation> viewReservationById(Long reservationId);

    void deleteReservationById(Long reservationId);

    void updateReservationById(UpdateReservationRequest reservationRequest, Long reservationId);
}
