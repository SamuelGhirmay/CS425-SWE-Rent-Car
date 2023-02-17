package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.CustomerRequest;
import edu.miu.cs425swerentcar.dto.LoginRequest;
import edu.miu.cs425swerentcar.dto.LoginResponse;
import edu.miu.cs425swerentcar.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public Customer createCustomer(CustomerRequest newCustomerRequest);
    public List<Customer> getAllCustomers();
    public Optional<Customer> getCustomerById(Long customerId);

    public Customer updateCustomer(Customer updateCustomerReq,Long customerId);

    public void deleteCustomer(Long customerId);

    LoginResponse login(LoginRequest loginRequest);
}
