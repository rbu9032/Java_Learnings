package com.rbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.rbu.model.Props;

import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@EnableConfigurationProperties(Props.class)
public class OrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, args);
	}

	@Bean
	public TimedAspect timeAspect(MeterRegistry meterRegistry) {
		return new TimedAspect(meterRegistry);
	}
	
	@Bean
	public CountedAspect countedAspect(MeterRegistry meterRegistry) {
		return new CountedAspect(meterRegistry);
	}
}
