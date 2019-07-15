package com.kj.ordercenter.entity;


import com.kj.ordercenter.framework.common.core.entity.BaseEntity;

import lombok.Data;

@Data
public class Order extends BaseEntity{

    /**  */
	private static final long serialVersionUID = -3792015781825984382L;
	private String orderNum;
    private String orderDesc;
}
