package com.example.weathermachine.model.repository

import com.example.weathermachine.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}