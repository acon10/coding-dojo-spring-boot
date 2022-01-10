package com.assignment.spring.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.assignment.spring.dto.WeatherOuterRequest;
import com.assignment.spring.exception.DataNotFoundException;
import com.assignment.spring.service.impl.WeatherServiceImpl;

@DisplayName("WeatherServiceTest tests")
public class WeatherServiceTest {

	@DisplayName("getWeather object value test")
	@Test
	public void getWeather() {
		var weatherService = new WeatherServiceImpl(null, null, null);
		
		Exception exception = Assertions.assertThrows(DataNotFoundException.class, () -> {
			weatherService.getWeather(null);
	    });
		Assertions.assertEquals("object is null", exception.getMessage());
	}
	
	@DisplayName("getWeather city value test")
	@Test
	public void getWeather2() {
		var weatherService = new WeatherServiceImpl(null, null, null);
		var weatherRequest = new WeatherOuterRequest();
		weatherRequest.setCity(null);
		
		Exception exception = Assertions.assertThrows(DataNotFoundException.class, () -> {
			weatherService.getWeather(weatherRequest);
	    });
		Assertions.assertEquals("city is null", exception.getMessage());
	}
}
