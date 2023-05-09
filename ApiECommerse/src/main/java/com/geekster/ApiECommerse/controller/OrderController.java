package com.geekster.ApiECommerse.controller;

import com.geekster.ApiECommerse.model.Orders;
import com.geekster.ApiECommerse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping()
    public void placeOrder(@RequestBody Orders orders){
        orderService.creteOrder(orders);
    }
}
