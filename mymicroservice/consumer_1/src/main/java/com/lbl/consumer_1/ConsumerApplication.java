package com.lbl.consumer_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/***
 * 
 * @author linbaolu
 * 2018-05-08
 *
 */
@SpringBootApplication  
@EnableDiscoveryClient  
@EnableFeignClients  
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