package com.kj.ordercenter.biz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kj.ordercenter.biz.entity.Order;

@Mapper
public interface OrderMapper {
	
	List<Order> list();
}
