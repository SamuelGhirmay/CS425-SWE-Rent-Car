package edu.miu.cs425swerentcar.controller;

import edu.miu.cs425swerentcar.dto.AdminRequest;
import edu.miu.cs425swerentcar.entity.Admin;
import edu.miu.cs425swerentcar.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/car-rental/api/admin")
public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Admin>> listStudent(){
        return ResponseEntity.ok(adminService.getAllAdmin());
    }

    @GetMapping(value ={"/get/{adminId}"})
    public ResponseEntity<Optional<Admin>> getStudentById(@PathVariable Long adminId){
        return ResponseEntity.ok(adminService.getAdminById(adminId));
    }


    @PostMapping(value = {"/new"})
    public ResponseEntity<Admin> addNewAdmin(@Valid @RequestBody AdminRequest adminRequest){
        return new ResponseEntity<>(adminService.addNewAdmin(adminRequest),
                HttpStatus.CREATED);
    }

    @PutMapping(value = {"/update/{adminId}"})
    public ResponseEntity<Admin> updateAdmin(@Valid @RequestBody AdminRequest adminRequest,
                                                 @PathVariable Long adminId){
        return new ResponseEntity<>(adminService.updateAdminById(adminRequest, adminId),
                HttpStatus.OK);
    }

    @DeleteMapping (value = {"/delete/{adminId}"})
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long adminId){
        adminService.deleteAdminById(adminId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
