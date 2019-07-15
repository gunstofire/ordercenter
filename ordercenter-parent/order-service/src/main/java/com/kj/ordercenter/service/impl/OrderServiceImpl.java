package com.kj.ordercenter.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kj.ordercenter.entity.Order;
import com.kj.ordercenter.mapper.OrderMapper;
import com.kj.ordercenter.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderMapper orderMapper;
    
    @Override
    public void insertOrder(Order order) {
        System.err.println("keyid:"+orderMapper.insertOrder(order));
    }

    @Override
    public List<Order> findOrders() {
        return orderMapper.findOrders();
    }

}
