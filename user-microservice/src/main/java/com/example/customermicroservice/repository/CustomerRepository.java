package com.example.customermicroservice.repository;

import com.example.customermicroservice.controller.dto.CustomerDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerDTO,String> {
}
