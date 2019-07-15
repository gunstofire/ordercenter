package com.kj.ordercenter.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author fukun.xie
 * @version $Id: OrderApplication.java, v 0.1 2019年7月15日 下午6:49:43 fukun.xie Exp $
 */
@SpringCloudApplication
//启用feign进行远程调用
@EnableFeignClients
public class OrderApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderApplication.class, args);
    }
}
