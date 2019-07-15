package com.kj.ordercenter.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 
 * @author fukun.xie
 * @version $Id: AdminApplication.java, v 0.1 2019年7月15日 下午2:59:15 fukun.xie Exp $
 */
@EnableAdminServer
@SpringBootApplication
public class AdminApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AdminApplication.class, args);
    }
}
