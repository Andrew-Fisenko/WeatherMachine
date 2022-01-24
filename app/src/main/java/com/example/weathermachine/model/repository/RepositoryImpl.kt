package com.example.weathermachine.model.repository

import com.example.weathermachine.model.entities.City
import com.example.weathermachine.model.entities.Weather
import com.example.weathermachine.model.entities.getRussianCities
import com.example.weathermachine.model.entities.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}