package com.kj.ordercenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kj.ordercenter.entity.Order;

@Mapper
public interface OrderMapper {

    int insertOrder(Order order);
    
    List<Order> findOrders();
}
