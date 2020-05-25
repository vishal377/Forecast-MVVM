package com.viveksharma.forecastmvvm.data.database.unitlocalized.future

import java.time.LocalDate

interface UnitSpecificSimpleFutureWeatherEntry {
    val date: LocalDate
    val avgTemperature: Double
    val conditionText: String
    val conditionIconUrl: String
}