package com.lbl.producer_1.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
  
@Controller  
@EnableAutoConfiguration  
public class ProducerController {  
  
	
	@ApiOperation(value="获取订单信息",notes="无入参，直接调用getOrder即可获取用户信息")
	@RequestMapping(value="/getOrder",method=RequestMethod.GET)
    @ResponseBody  
    public String getOrder() {  
  
        return "我是producer_1";  
    }  
      
}  
