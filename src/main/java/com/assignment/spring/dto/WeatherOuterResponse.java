package com.assignment.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherOuterResponse {
	private String city;
    private String country;
    private Double temperature;
}
