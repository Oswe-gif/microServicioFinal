package com.example.ordermicroservice.controller;
import com.example.ordermicroservice.logic.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@AllArgsConstructor
public class OrderOrchestratorController {
    OrderService orderService;


    @PostMapping(path = "api/order/{idCustomer}/{idProduct}/{idSeller}")
    public String createOrder(@PathVariable String idCustomer, @PathVariable String idProduct, @PathVariable String idSeller)
    {
        return "A order was created. customer information:"+orderService.getCustomer(idCustomer).toString()
                +". Order information: "+orderService.getProduct(idProduct).toString()
                +". Seller information: "+orderService.getSeller(idSeller).toString();
    }




}
