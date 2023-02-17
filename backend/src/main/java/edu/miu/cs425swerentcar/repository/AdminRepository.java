package edu.miu.cs425swerentcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.miu.cs425swerentcar.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin> findAdminByUsernameAndPassword(String username, String password);
}
