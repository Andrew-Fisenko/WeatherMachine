package com.example.weathermachine.model.entities

import com.example.weathermachine.model.entities.City

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 10,
    val feelsLike: Int = 10

)

fun getDefaultCity() = City("Moscow", 55.755826, 37.617299900000035)
