package com.robert.orders_service.controllers;

import com.robert.orders_service.model.dto.OrderRequest;
import com.robert.orders_service.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        this.orderService.placeOrder(orderRequest);
        return "Order placed sucessfully";
    }
}
