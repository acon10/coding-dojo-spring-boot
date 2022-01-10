package com.assignment.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.spring.dto.WeatherOuterRequest;
import com.assignment.spring.dto.WeatherOuterResponse;
import com.assignment.spring.service.WeatherService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/weather")
public class WeatherController {
	private final WeatherService wetherService;

	@GetMapping
	public ResponseEntity<WeatherOuterResponse> weather(@RequestBody WeatherOuterRequest request) {
		return ResponseEntity.ok(wetherService.getWeather(request));
	}

}
