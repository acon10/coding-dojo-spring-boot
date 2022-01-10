package com.assignment.spring.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class WeatherUtil {
	public static final String APP_ID = "08e8ce3d15d3e8d4254f9e012d7d91ad";
    public static final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&APPID={appid}";
}
