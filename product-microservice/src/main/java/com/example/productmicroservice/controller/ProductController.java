package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.dto.ProductDTO;
import com.example.productmicroservice.logic.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    @PostMapping(path = "api/product")
    public void createProduct(@RequestBody ProductDTO product)
    {
        productService.createProduct(product);
    }
    @GetMapping(path = "api/products")
    public List<ProductDTO> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping(path = "api/product/{id}")
    public Optional<ProductDTO> getProduct(@PathVariable String id)
    {
        return productService.getProduct(id);
    }


}
