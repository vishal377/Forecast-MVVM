package com.viveksharma.forecastmvvm.ui.weather.future.detail

import com.viveksharma.forecastmvvm.data.provider.UnitProvider
import com.viveksharma.forecastmvvm.data.repository.ForecastRepository
import com.viveksharma.forecastmvvm.internal.lazyDeferred
import com.viveksharma.forecastmvvm.ui.base.WeatherViewModel
import java.time.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetric)
    }
}
