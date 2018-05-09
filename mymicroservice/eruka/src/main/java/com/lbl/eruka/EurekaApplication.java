package com.lbl.eruka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * 
 * @author linbaolu 2018-05-05
 *         如果注册中心是eureka那么用EnableEurekaServer、EnableEurekaClient，如果注册中心是其他的话，那么用@EnableDiscoveryServer、@EnableDiscoveryClient,注解@EnableEurekaClient上有@EnableDiscoveryClient注解，可以说基本就是EnableEurekaClient有@EnableDiscoveryClient的功能，另外上面的注释中提到，其实**@EnableEurekaClient**z注解就是一种方便使用eureka的注解而已，可以说使用其他的注册中心后，都可以使用@EnableDiscoveryClient注解，
 *         但是使用@EnableEurekaClient的情景，就是在服务采用eureka作为注册中心的时候，使用场景较为单一。
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

	private final static Logger logger = LoggerFactory.getLogger(EurekaApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(EurekaApplication.class, args);
		logger.info("SpringBoot Start Success");
	}

}
