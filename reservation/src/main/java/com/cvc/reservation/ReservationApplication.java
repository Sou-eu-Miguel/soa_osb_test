package com.cvc.reservation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@EnableScheduling
@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {		
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
