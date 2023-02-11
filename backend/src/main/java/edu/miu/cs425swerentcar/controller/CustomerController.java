package edu.miu.cs425swerentcar.controller;

import edu.miu.cs425swerentcar.dto.CustomerRequest;
import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/car-rental/v1/api/customer"})
public class CustomerController {
    @Autowired
   private CustomerService customerService;

    @PostMapping("/create")
    public Customer createNewCustomer(@Valid @RequestBody CustomerRequest newCustomerRequest){
        return customerService.createCustomer(newCustomerRequest);
    }

    @GetMapping("/list")
    public List<Customer> displayCustomers(){
        return customerService.getAllCustomer();
    }
    @PutMapping("/update/{customerId}")
    public Customer updateCustomer(@Valid @RequestBody CustomerRequest updateCustomer,@PathVariable Long customerId){

        return customerService.updateCustomer(updateCustomer,customerId);
    }

    @DeleteMapping()
    public void deleteCustomerById(@PathVariable Long customerId){
        customerService.deleteCustomer(customerId);
    }




}
