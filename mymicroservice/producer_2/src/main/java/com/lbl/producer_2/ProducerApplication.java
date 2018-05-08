package com.lbl.producer_2;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.boot.web.support.SpringBootServletInitializer;  
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;  
  
/***
 * 
 * @author linbaolu
 * 2018-05-05
 *
 */
@SpringBootApplication  
@EnableDiscoveryClient  
public class ProducerApplication extends SpringBootServletInitializer {  
  
    public static void main(String[] args) {  
        SpringApplication.run(ProducerApplication.class, args);  
    }  
      
}  