package com.lbl.consumer_1.fegin;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements ConsumerFeignClient {

	@Override
	public String getOrder() {
		return "获取getOrder失败！";
	}

}