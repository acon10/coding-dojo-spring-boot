package com.assignment.spring.service;

import com.assignment.spring.dto.WeatherOuterRequest;
import com.assignment.spring.dto.WeatherOuterResponse;

public interface WeatherService {
	WeatherOuterResponse getWeather(WeatherOuterRequest weatherRequest);
}
