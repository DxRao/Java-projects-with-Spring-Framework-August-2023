package com.drao.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public void customizedObject() {
		
		SendingEmail se = new SendingEmail("Spring Boot is much easier to work");	
		
	}

}
