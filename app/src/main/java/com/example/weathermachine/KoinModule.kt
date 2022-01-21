package com.example.weathermachine

import com.example.weathermachine.model.repository.Repository
import com.example.weathermachine.model.repository.RepositoryImpl
import com.example.weathermachine.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<Repository> { RepositoryImpl() }

    viewModel { MainViewModel(get()) }
}

