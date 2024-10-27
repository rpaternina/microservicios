package com.robert.orders_service.model.dto;


import com.robert.orders_service.model.entities.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderItemRequest> orderItems;
}


