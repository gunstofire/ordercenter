package com.kj.ordercenter.biz.entity;



import java.util.Date;

import lombok.Data;

@Data
public class Order {
	
	private Integer id;
	private Date createTm;
	private String orderNumber;
	private String orderDescription;
}
