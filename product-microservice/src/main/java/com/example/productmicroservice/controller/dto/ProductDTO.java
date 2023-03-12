package com.example.productmicroservice.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")//the collection in mongoDB is called "product"
@Getter
@Setter
public class ProductDTO {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private int unitPrice;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
