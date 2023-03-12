package com.example.ordermicroservice.controller;
import cats.kernel.Order;
import com.example.ordermicroservice.controller.dto.OrderDTO;
import com.example.ordermicroservice.logic.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@AllArgsConstructor
public class OrderOrchestratorController {
    OrderService orderService;


    @PostMapping(path = "api/order")
    public String createOrder(@RequestBody OrderDTO orderDTO)
    {
        return orderService.createOrder(orderDTO);
    }




}
