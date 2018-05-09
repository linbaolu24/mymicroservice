package com.lbl.consumer_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/***
 * 
 * @author linbaolu
 * 2018-05-05
 *
 */
@SpringBootApplication  
@EnableDiscoveryClient  
@EnableFeignClients  
@EnableCircuitBreaker
@EnableHystrixDashboard
public class ConsumerApplication extends SpringBootServletInitializer {  
  
    public static void main(String[] args) {  
        SpringApplication.run(ConsumerApplication.class, args);  
    }  
      
  /*  @Bean 
    @LoadBalanced 
    public RestTemplate restTemplate() { 
        return new RestTemplate(); 
    } */
      
}  