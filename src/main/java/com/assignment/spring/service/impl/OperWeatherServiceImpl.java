package com.assignment.spring.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.spring.api.WeatherResponse;
import com.assignment.spring.service.OpenWetherService;
import com.assignment.spring.util.WeatherUtil;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OperWeatherServiceImpl implements OpenWetherService {
	private final RestTemplate restTemplate;

	@Override
	public WeatherResponse getWeather(String city) {
		String url = WeatherUtil.WEATHER_API_URL.replace("{city}", city).replace("{appid}", WeatherUtil.APP_ID);
		ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(url, WeatherResponse.class);
		return response.getBody();
	}
}
