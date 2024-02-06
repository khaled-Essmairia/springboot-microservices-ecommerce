package com.microservice.orderservice.service;

import com.microservice.orderservice.payload.OrderRequest;
import com.microservice.orderservice.payload.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
