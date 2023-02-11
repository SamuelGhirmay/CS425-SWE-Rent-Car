package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.AdminRequest;
import edu.miu.cs425swerentcar.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AdminService {

    Admin saveAdmin(Admin newAdmin);

    List<Admin> getAllAdmin();

    Optional<Admin> getAdminById(Long adminId);

    Admin addNewAdmin(AdminRequest newAdminRequest);


    void deleteAdminById(Long adminId);

    Admin updateAdminById(AdminRequest editedAdmin, Long adminId);
}
