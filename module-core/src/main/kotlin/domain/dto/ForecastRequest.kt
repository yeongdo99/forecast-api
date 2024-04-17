package com.forecast.domain.dto


data class ForecastRequest (
    val location: String,
    val temperature: Double,
    val description: String
)