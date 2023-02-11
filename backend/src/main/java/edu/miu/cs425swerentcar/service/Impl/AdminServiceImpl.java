package edu.miu.cs425swerentcar.service.Impl;

import edu.miu.cs425swerentcar.dto.AdminRequest;
import edu.miu.cs425swerentcar.entity.Admin;
import edu.miu.cs425swerentcar.repository.AdminRepository;
import edu.miu.cs425swerentcar.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin saveAdmin(Admin newAdmin) {
        return adminRepository.save(newAdmin);
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Optional<Admin> getAdminById(Long adminId) {
        return adminRepository.findById(adminId);
    }

    @Override
    public Admin addNewAdmin(AdminRequest newAdminRequest) {
        Admin newAdmin = Admin.build(null, newAdminRequest.getUserName(),newAdminRequest.getPassword(),
                newAdminRequest.getPosition(),null);
        return adminRepository.save(newAdmin);
    }


    @Override
    public void deleteAdminById(Long adminId) {
        adminRepository.deleteById(adminId);
    }

    @Override
    public Admin updateAdminById(AdminRequest editedAdmin, Long adminId) {
        Admin updatedAdmin = Admin.build(adminId, editedAdmin.getUserName(), editedAdmin.getPassword(), editedAdmin.getPosition(),null);
        return adminRepository.save((updatedAdmin));
    }


}
