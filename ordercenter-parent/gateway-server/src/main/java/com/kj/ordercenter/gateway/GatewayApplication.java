package com.kj.ordercenter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 
 * @author fukun.xie
 * @version $Id: GatewayApplication.java, v 0.1 2019年7月15日 下午2:43:33 fukun.xie Exp $
 */
@SpringCloudApplication
public class GatewayApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
