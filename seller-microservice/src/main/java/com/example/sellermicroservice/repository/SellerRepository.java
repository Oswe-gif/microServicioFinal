package com.example.sellermicroservice.repository;

import com.example.sellermicroservice.controller.dto.SellerDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<SellerDTO,String> {

}
