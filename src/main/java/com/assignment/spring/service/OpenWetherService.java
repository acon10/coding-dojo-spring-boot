package com.assignment.spring.service;

import com.assignment.spring.api.WeatherResponse;

public interface OpenWetherService {
	WeatherResponse getWeather(String city);
}
