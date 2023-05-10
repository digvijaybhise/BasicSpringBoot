package com.geekster.ApiECommerse.controller;

import com.geekster.ApiECommerse.model.Orders;
import com.geekster.ApiECommerse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping()
    ResponseEntity<String> placeOrder(@RequestBody Orders orders){

        String response;
        HttpStatus status;
        try {
            orderService.creteOrder(orders);
            response = "Your order is placed successfully...!!!";
            status = HttpStatus.ACCEPTED;
        }catch (Exception e){
            response = "Invalid data...!!! Please check & Re-order";
            status = HttpStatus.BAD_REQUEST;
        }
         return new ResponseEntity<String>(response, status);
    }

    @GetMapping("/{orderId}")
    public Orders getById(@PathVariable Long orderId){
        return orderService.getById(orderId);
    }
}
