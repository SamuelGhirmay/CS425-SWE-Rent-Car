package edu.miu.cs425swerentcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.miu.cs425swerentcar.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
}
