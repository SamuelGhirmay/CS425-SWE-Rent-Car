package edu.miu.cs425swerentcar.controller;

import edu.miu.cs425swerentcar.entity.Reservation;
import edu.miu.cs425swerentcar.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/car-rental/v1/api/reservation")
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @GetMapping(value = "/list")
    public List<Reservation> listAllReservations() {
        return reservationService.getAllReservation();
    }

    @PostMapping(value = "/make")
    public Reservation makeNewReservation(Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @DeleteMapping(value = "/cancel/")
    public void cancelReservation(Long reservationId) {
        reservationService.cancelReservationById(reservationId);
    }

    @GetMapping(value = "/view")
    public Optional<Reservation> viewReservationById(Long reservationId){
        return reservationService.viewReservationById(reservationId);
    }
}
