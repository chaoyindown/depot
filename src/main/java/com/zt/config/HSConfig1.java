package com.zt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zt.bean.Dog;

@Configuration
public class HSConfig1 {

	@Bean
	Dog addCat1(){
		return new Dog();
	}
}
