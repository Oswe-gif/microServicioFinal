package com.example.customermicroservice.logic;
import com.example.customermicroservice.controller.dto.CustomerDTO;
import com.example.customermicroservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;
    public void createCustomer(CustomerDTO customer)
    {
        customerRepository.save(customer);
    }
    public List<CustomerDTO> getAllCustomers()
    {
        return customerRepository.findAll();
    }
    public Optional<CustomerDTO> getCustomer(String id)
    {
        return customerRepository.findById(id);
    }



}
