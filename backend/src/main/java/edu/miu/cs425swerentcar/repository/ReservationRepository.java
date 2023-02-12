package edu.miu.cs425swerentcar.repository;

import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findReservationsByCustomerCustomerId(Long customerId);
}
