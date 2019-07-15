package com.kj.ordercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author fukun.xie
 * @version $Id: ConfigCTApplication.java, v 0.1 2019年7月15日 下午2:34:24 fukun.xie Exp $
 */
@EnableConfigServer
@SpringCloudApplication
public class ConfigCTApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConfigCTApplication.class, args);
    }
}
