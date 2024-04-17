package com.forecast.domain.dto

data class ForecastResponse (
    val id: Long,
    val location: String,
    val temperature: Double,
    val description: String
)