package com.example.finalproject

import com.squareup.moshi.Json

class WeatherApiResponse {
    @Json(name = "current_weather")
    lateinit var currentWeatherStats: WeatherStats
}

class WeatherStats {
    @Json(name = "temperature")
    var temperature: Double = 0.0
}