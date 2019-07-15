package com.kj.ordercenter.framework.common.core.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 
 * @author fukun.xie
 * @version $Id: BaseEntity.java, v 0.1 2019年7月15日 下午4:19:24 fukun.xie Exp $
 */
@Data
public class BaseEntity implements Serializable{

	/**  */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date createTm;
}
