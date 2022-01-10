package com.assignment.spring.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {
	@Bean
	Mapper mapper() {
		return new DozerBeanMapper();
	}

}
