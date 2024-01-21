package com.ED.springbootmall.dao;

import com.ED.springbootmall.dto.CreateOrderRequest;
import com.ED.springbootmall.model.Order;
import com.ED.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
}
