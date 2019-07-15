package com.kj.ordercenter.service;

import java.util.List;

import com.kj.ordercenter.entity.Order;

public interface OrderService {

    void insertOrder(Order order);
    
    List<Order> findOrders();
}
