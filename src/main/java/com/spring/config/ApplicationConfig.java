package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.bo.TravelBO;
import com.spring.model.AdditionalChargeInfo;
import com.spring.model.Travel;
import com.spring.service.TravelService;

//fill the code
@Configuration
@PropertySource("classpath:charges.properties")
public class ApplicationConfig {

	@Bean
	Travel travel() {
		return new Travel();
	}

	@Bean
	TravelBO travelBO() {
		return new TravelBO();
	}

	@Bean
	TravelService travelService() {
		return new TravelService();
	}

	@Bean
	AdditionalChargeInfo additionalChargeInfo() {
		return new AdditionalChargeInfo();
	}

}
