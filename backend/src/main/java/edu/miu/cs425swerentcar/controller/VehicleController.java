package edu.miu.cs425swerentcar.controller;


import edu.miu.cs425swerentcar.dto.VehicleRequest;
import edu.miu.cs425swerentcar.entity.Vehicle;
import edu.miu.cs425swerentcar.entity.VehicleStatus;
import edu.miu.cs425swerentcar.exception.VehicleNotFoundException;
import edu.miu.cs425swerentcar.service.VehicleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/car-rental/v1/api/vehicles")
public class VehicleController {

    private VehicleService vehicleService;
    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    //List all vehicles
    @GetMapping(value = "/list")
    public ResponseEntity<List<Vehicle>> listAllVehicles() {
        return ResponseEntity.ok(vehicleService.getAllVehicle());
    }

    @GetMapping(value = "/get/{vehicleId}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long vehicleId) throws VehicleNotFoundException {
        return ResponseEntity.ok(vehicleService.getVehicleById(vehicleId));

    }
    @GetMapping(value = "/getVehicleByModel/{model}")
    public ResponseEntity<List<Vehicle>> getVehiclesByModel(@PathVariable String model) {
        return ResponseEntity.ok(vehicleService.getVehicleByModel(model));
    }
    @GetMapping(value = "/getVehicleByPrice/{price}")
    public ResponseEntity<List<Vehicle>> getVehiclesByPrice(@PathVariable double price) {
        return ResponseEntity.ok(vehicleService.getVehicleByPrice(price));
    }
    @GetMapping(value = "/getVehicleByTransmission/{transmission}")
    public ResponseEntity<List<Vehicle>> getVehicleByTransmissionType(@PathVariable String transmission){
        return ResponseEntity.ok(vehicleService.getVehicleByTransmission(transmission));
    }

    @PutMapping(value = "/update/{vehicleId}")
    public  Vehicle updateVehicleById(@RequestBody VehicleRequest vehicle, @PathVariable Long vehicleId) {
        return  vehicleService.updateVehicleById(vehicle,vehicleId);
    }

    @PostMapping(value = "/add")
    public Vehicle addNewVehicle(@Valid @RequestBody Vehicle vehicle)  {
        return vehicleService.addNewVehicle(vehicle);
    }
    @DeleteMapping(value = "/delete/{vehicleId}")
    public void deleteById(@PathVariable Long vehicleId) {
        vehicleService.deleteById(vehicleId);
    }

    @PutMapping("/update-status/{vehicleId}")
    public void updateVehicleStatus(@PathVariable Long vehicleId, @RequestBody VehicleStatus vehicleStatus){
         vehicleService.updateVehicleStatus(vehicleId, vehicleStatus);

    }

}
