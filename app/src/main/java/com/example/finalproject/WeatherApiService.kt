package com.example.finalproject

import com.google.android.gms.common.api.Api
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Headers
import retrofit2.http.Path

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()


private const val BASE_URL =
    "https://api.api-ninjas.com/v1/"

private val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL).build()

private const val QUERY_STRING = "weather?city=18411"

interface WeatherApiService {
    @GET(QUERY_STRING)
    @Headers("Authorization: token ${"Erb6K2K+kVBBuzJpBqrAkA==MqAgu3aXERRGgkVZ"}")
    fun getWeather(@Path("username") username: String): Call<ApiResponse>
}
object WeatherApi{
    val weatherApi: WeatherApiService by lazy {
        retrofit.create(WeatherApiService::class.java)
    }
}