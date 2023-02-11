package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.entity.Reservation;
import edu.miu.cs425swerentcar.repository.ReservationRepository;
import edu.miu.cs425swerentcar.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void cancelReservationById(Long reservationId) {
        reservationRepository.deleteById(reservationId);

    }

    @Override
    public Optional<Reservation> viewReservationById(Long reservationId) {
        return reservationRepository.findById(reservationId);
    }
}
