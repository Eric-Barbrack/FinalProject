package com.example.finalproject

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.common.api.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherViewModel: ViewModel() {
    private val _response = MutableLiveData<List<Weather>>()
    val response: LiveData<List<Weather>>
        get() = _response
    private var _averageWeather = 0
    val averageWeather: Int
        get() = _averageWeather

    fun getWeather() {
        val request = WeatherApi.weatherApi.getWeather()
        request.enqueue(object : Callback<ApiResponse> {
            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                Log.d("RESPONSE", "Failure: " + t.message)
            }

            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                val weatherResponse: ApiResponse? = response.body()
                val minTemp = weatherResponse?.minTemp
                val maxTemp = weatherResponse?.maxTemp
                val currentTemp = weatherResponse?.temp

                val _averageWeather = currentTemp
            }
        })
    }
}