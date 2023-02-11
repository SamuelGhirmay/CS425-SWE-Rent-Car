package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.dto.CustomerRequest;
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
                newCustomerRequest.getEmail(),newCustomerRequest.getPhone(),newCustomerRequest.getPassword(),newCustomerRequest.getDriverLicense());
        return this.customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public Customer updateCustomer(CustomerRequest updateCustomerReq, Long customerId) {
        Customer customer =Customer.build(customerId,updateCustomerReq.getFirstName(),updateCustomerReq.getLastName()
                ,updateCustomerReq.getEmail(),updateCustomerReq.getPhone(),updateCustomerReq.getPassword(),updateCustomerReq.getDriverLicense());


        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {customerRepository.deleteById(customerId);}


}
