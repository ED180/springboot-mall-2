package com.ED.springbootmall.service;

import com.ED.springbootmall.dto.CreateOrderRequest;
import com.ED.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
