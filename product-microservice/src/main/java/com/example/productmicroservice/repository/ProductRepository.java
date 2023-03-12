package com.example.productmicroservice.repository;

import com.example.productmicroservice.controller.dto.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDTO,String> {

}
