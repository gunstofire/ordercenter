package com.kj.ordercenter.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.kj.ordercenter.biz.entity.Order;
import com.kj.ordercenter.biz.mapper.OrderMapper;
import com.kj.ordercenter.biz.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderMapper orderMapper;
	
	@Autowired
    RedisTemplate<String, String> redisTemplate;
	
	@Override
	public List<Order> list() {
		//rediscunc
		redisTemplate.opsForValue().set("test", "4321");
		
		List<Order> list = orderMapper.list();
		for(int i=0;i<list.size();i++) {
			System.err.println(list.get(i).getOrderNumber());
		}
		return list;
	}

}
