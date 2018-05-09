package com.lbl.consumer_1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lbl.consumer_1.fegin.ConsumerFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.annotations.ApiOperation;

/***
 * 
 * @author linbaolu
 * 2018-05-05
 *
 */
@Controller
@EnableAutoConfiguration
public class UserController {

	/*@Autowired
	private RestTemplate restTemplate;*/

	@Autowired
	private ConsumerFeignClient feignClient;

	private final static Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@ApiOperation(value="获取用户信息",notes="无入参，直接调用getUser即可获取用户信息")
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "hasError")
	@ResponseBody
	public String getUser() {

		// 调用远程服务
		/*ResponseEntity<String> responseEntity = restTemplate.getForEntity(
				"http://myproducer/getOrder", String.class);
		logger.info("res=" + JSON.toJSONString(responseEntity));*/
		
		String result = feignClient.getOrder();
		logger.info("res="+result);
		return result;
	}
	
	public String hasError() {
		return "哎哟！出错了!";
	}

}
