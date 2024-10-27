package com.robert.orders_service.services;

import com.robert.orders_service.model.dto.BaseResponse;
import com.robert.orders_service.model.dto.OrderItemRequest;
import com.robert.orders_service.model.dto.OrderRequest;
import com.robert.orders_service.model.entities.Order;
import com.robert.orders_service.model.entities.OrderItems;
import com.robert.orders_service.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final WebClient.Builder webClientBuilder;

    public void placeOrder(OrderRequest orderRequest) {

        BaseResponse result = this.webClientBuilder.build()
                .post()
                .uri("http://localhost:8083/api/inventory/in-stop")
                .bodyValue(orderRequest.getOrderItems())
                .retrieve()
                .bodyToMono(BaseResponse.class)
                .block();
        if(result != null && !result.hasErrors()) {

            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setOrderItems(orderRequest.getOrderItems().stream()
                    .map(orderItemRequest -> mapOrderItemRequestToOrderItem(orderItemRequest, order))
                    .toList());
            this.orderRepository.save(order);
        }else {
            throw new IllegalArgumentException("Some of the products are not in stock");
        }
    }

    private OrderItems mapOrderItemRequestToOrderItem(OrderItemRequest orderItemRequest, Order order) {
        return OrderItems.builder()
                .id(orderItemRequest.getId())
                .sku(orderItemRequest.getSku())
                .price(orderItemRequest.getPrice())
                .quantity(orderItemRequest.getQuantity())
                .order(order)
                .build();
    }
}
