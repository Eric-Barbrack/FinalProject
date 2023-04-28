package com.example.finalproject

import com.squareup.moshi.Json

class ApiResponse {
    @Json(name = "temp")
    var temp: Int = 0

    @Json(name = "min_temp")
    var minTemp: Int = 0

    @Json(name = "max_temp")
    var maxTemp: Int = 0
}