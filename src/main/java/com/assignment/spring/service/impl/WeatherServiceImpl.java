package com.assignment.spring.service.impl;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import com.assignment.spring.api.WeatherResponse;
import com.assignment.spring.domain.WeatherEntity;
import com.assignment.spring.dto.WeatherOuterRequest;
import com.assignment.spring.dto.WeatherOuterResponse;
import com.assignment.spring.exception.DataNotFoundException;
import com.assignment.spring.repository.WeatherRepository;
import com.assignment.spring.service.OpenWetherService;
import com.assignment.spring.service.WeatherService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class WeatherServiceImpl implements WeatherService {
	private final WeatherRepository weatherRepository;
	private final OpenWetherService openWetherService;
	private final Mapper mapper;

	@Override
	public WeatherOuterResponse getWeather(WeatherOuterRequest weatherRequest) {
		var entity = new WeatherEntity();
		Optional.ofNullable(weatherRequest).ifPresentOrElse(data->{
			String city = data.getCity();
			if(StringUtils.isEmpty(city)) {
				throw new DataNotFoundException("city is null");
			}
			WeatherResponse response = openWetherService.getWeather(city);
			entity.setCity(response.getName());
			entity.setCountry(response.getSys().getCountry());
			entity.setTemperature(response.getMain().getTemp());
			weatherRepository.save(entity);
		}, ()->{
			throw new DataNotFoundException("object is null");
		});
		
		return mapper.map(entity, WeatherOuterResponse.class);
		

	}
}
