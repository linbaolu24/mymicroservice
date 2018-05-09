package com.lbl.consumer_1.fegin;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<ConsumerFeignClient> {

	@Override
	public ConsumerFeignClient create(Throwable cause) {
		return new ConsumerFeignClient() {

			@Override
			public String getOrder() {
				return "fallback;reason was: " + cause.getMessage();
			}

		};
	}

}
