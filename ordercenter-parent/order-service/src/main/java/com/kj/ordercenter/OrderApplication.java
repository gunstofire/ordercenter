package com.kj.ordercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 
 * @author fukun.xie
 * @version $Id: OrderApplication.java, v 0.1 2019年7月15日 下午4:06:02 fukun.xie Exp $
 */
@SpringCloudApplication
public class OrderApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderApplication.class, args);
    }
}
