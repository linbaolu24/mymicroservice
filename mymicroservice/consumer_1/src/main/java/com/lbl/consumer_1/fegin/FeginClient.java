package com.lbl.consumer_1.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
  
/***
 * 
 * @author linbaolu
 * 2018-05-05
 *
 */
@FeignClient(name = "producer", fallback = FeginClient.class)  
public interface FeginClient {  
  
    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)  
    String getOrder();  
  
} 