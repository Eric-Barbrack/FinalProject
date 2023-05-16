package com.example.finalproject

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherViewModel: ViewModel() {
    private val _response = MutableLiveData<Double?>()
    val response: LiveData<Double?>
        get() = _response


    fun getWeather() {
        val request = WeatherApi.weatherApi.getWeather()
        request.enqueue(object : Callback<WeatherApiResponse> {
            override fun onFailure(call: Call<WeatherApiResponse>, t: Throwable) {
                Log.d("RESPONSE", "Failure: " + t.message)
            }

            override fun onResponse(call: Call<WeatherApiResponse>, response: Response<WeatherApiResponse>) {
                val weatherResponse: WeatherApiResponse? = response.body()
                val currentWeather = weatherResponse?.currentWeatherStats
                val num : Double? = currentWeather?.temperature
                if (num != null) {
                    _response.value = num.toDouble()
                }

            }
        })
    }
}