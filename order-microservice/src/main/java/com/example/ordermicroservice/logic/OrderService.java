package com.example.ordermicroservice.logic;
import com.example.ordermicroservice.controller.dto.CustomerDTO;
import com.example.ordermicroservice.controller.dto.OrderDTO;
import com.example.ordermicroservice.controller.dto.ProductDTO;
import com.example.ordermicroservice.controller.dto.SellerDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService {

    RestTemplate restTemplate;

    public void createCustomer(CustomerDTO customer)
    {
        restTemplate.getForObject("http://localhost:8081/api/"+customer,null );
    }
    public List<CustomerDTO> getAllCustomers()
    {
        return restTemplate.getForObject("http://localhost:8081/api/customers",List.class);
    }
    public Optional<CustomerDTO> getCustomer(String id)
    {
        return restTemplate.getForObject("http://localhost:8081/api/customer/"+id,Optional.class);
    }

    public void createSeller(SellerDTO seller){
        restTemplate.getForObject("http://localhost:8082/api/"+seller,null);
    }
    public List<SellerDTO> getAllSellers(){
        return restTemplate.getForObject("http://localhost:8082/api/sellers",List.class);
    }
    public Optional<SellerDTO> getSeller(String id){
        return restTemplate.getForObject("http://localhost:8082/api/seller/"+id,Optional.class);
    }

    public void createProduct(ProductDTO product)
    {
        restTemplate.getForObject("http://localhost:8083/api/"+product,null);
    }
    public List<ProductDTO> getAllProducts()
    {
        return restTemplate.getForObject("http://localhost:8083/api/products",List.class);
    }
    public Optional<ProductDTO> getProduct(String id)
    {
        return restTemplate.getForObject("http://localhost:8083/api/product/"+id,Optional.class);
    }


    public boolean getExistingCustomer(String id)
    {
        Optional<CustomerDTO> customerDTO=this.getCustomer(id);
        return customerDTO.isPresent();
    }
    public boolean getExistingSeller(String id)
    {
        Optional<SellerDTO> sellerDTO=this.getSeller(id);
        return sellerDTO.isPresent();
    }
    public boolean getExistingProduct(String id)
    {
        Optional<ProductDTO> productDTO=this.getProduct(id);
        return productDTO.isPresent();
    }
    public String createOrder(OrderDTO orderDTO)
    {
        if (getExistingCustomer(orderDTO.getCustomerId())&&getExistingSeller(orderDTO.getSellerId())&&getExistingProduct(orderDTO.getProductId())){
            return "A order was created. customer information:"+getCustomer(orderDTO.getCustomerId()).toString()
                    +". Order information: "+getProduct(orderDTO.getProductId()).toString()
                    +". Seller information: "+getSeller(orderDTO.getSellerId()).toString();
        }
        else {
            return "Failed to create order";
        }
    }

}
