package com.kj.ordercenter.zipkin;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;

import zipkin.storage.mysql.MySQLStorage;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * 
 * @author fukun.xie
 * @version $Id: ZipkinApplication.java, v 0.1 2019年7月15日 下午3:45:16 fukun.xie Exp $
 */
@EnableZipkinServer
@SpringCloudApplication
public class ZipkinApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZipkinApplication.class, args);
    }
    
    @Bean
	public MySQLStorage mySQLStorage(DataSource datasource) {
		return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
	}
}
