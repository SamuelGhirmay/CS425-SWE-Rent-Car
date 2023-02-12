package edu.miu.cs425swerentcar.repository;

import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findCustomerByEmailAndPassword(String email, String password);
}

