package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    // this map will map the current day
// index to the weather data of that day
    val currentWeatherData: WeatherData?
)
