package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.AdminRequest;
import edu.miu.cs425swerentcar.dto.LoginRequest;
import edu.miu.cs425swerentcar.dto.LoginResponse;
import edu.miu.cs425swerentcar.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AdminService {

    Admin saveAdmin(Admin newAdmin);

    List<Admin> getAll();

    Optional<Admin> getAdminById(Long adminId);

    LoginResponse login(LoginRequest loginRequest);
}
