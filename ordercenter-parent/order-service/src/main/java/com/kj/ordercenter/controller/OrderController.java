package com.kj.ordercenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kj.ordercenter.entity.Order;
import com.kj.ordercenter.framework.common.core.result.Response;
import com.kj.ordercenter.service.OrderService;

@RestController
//@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    
    @RequestMapping(value="order",method = RequestMethod.POST)
    public Response<String> save(@RequestBody Order order) {
        orderService.insertOrder(order);
        return new Response<String>("ok");
    }
    
    @RequestMapping(value="orders",method = RequestMethod.GET)
    public Response<List<Order>> findList() {
        return new Response<List<Order>>(orderService.findOrders());
    }
}
