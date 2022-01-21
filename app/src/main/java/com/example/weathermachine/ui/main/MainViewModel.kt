package com.example.weathermachine.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weathermachine.model.AppState
import com.example.weathermachine.model.repository.Repository
import java.lang.Exception
import java.lang.Thread.sleep

class MainViewModel(private val repository: Repository) : ViewModel() {

    private val liveData = MutableLiveData<AppState>()

    fun getLiveData(): LiveData<AppState> = liveData
    
    fun getWeather() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveData.value = AppState.Loading
        val x: Int = (Math.random() * 2).toInt()
        if (x == 0) {
            Thread {
                sleep(1000)
                liveData.postValue(AppState.Success(repository.getWeatherFromLocalStorage()))
            }.start()
        } else if (x == 1) {
            Thread {
                sleep(1000)
                liveData.postValue(AppState.Error(Exception()))
            }.start()
        }
    }

    override fun onCleared() {
        super.onCleared()
    }
}