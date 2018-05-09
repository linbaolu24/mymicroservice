package com.lbl.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy  
@SpringCloudApplication    
//整合@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker  
public class ZuulApplication {  
  
    public static void main(String[] args) {  
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);  
    }  
}  
