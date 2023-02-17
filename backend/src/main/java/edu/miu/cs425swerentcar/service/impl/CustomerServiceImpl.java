package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.dto.CustomerRequest;
import edu.miu.cs425swerentcar.dto.LoginRequest;
import edu.miu.cs425swerentcar.dto.LoginResponse;
import edu.miu.cs425swerentcar.entity.Admin;
import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.repository.CustomerRepository;
import edu.miu.cs425swerentcar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(CustomerRequest newCustomerRequest) {
        Customer customer = Customer.build(null,newCustomerRequest.getFirstName(),newCustomerRequest.getLastName(),
                newCustomerRequest.getEmail(),null,newCustomerRequest.getPassword(),null);
        return this.customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public Customer updateCustomer(Customer updateCustomerReq, Long customerId) {
        Customer customer = this.customerRepository.findById(customerId).get();
        if(customer != null) {
            customer.setEmail(updateCustomerReq.getEmail());
            customer.setPhone(updateCustomerReq.getPhone());
            customer.setDriverLicense(updateCustomerReq.getDriverLicense());
            customer.setFirstName(updateCustomerReq.getFirstName());
            customer.setLastName(updateCustomerReq.getLastName());
            return customerRepository.save(customer);
        }
       return customer;
    }

    @Override
    public void deleteCustomer(Long customerId) {customerRepository.deleteById(customerId);}

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        Optional<Customer> customer = customerRepository.findCustomerByEmailAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        return new LoginResponse(customer.map(Customer::getCustomerId).orElse(null));
    }
}
