package com.forecast.domain

import com.forecast.domain.dto.ForecastRequest
import com.forecast.domain.entity.Forecast
import com.forecast.domain.repository.ForecastRepository
import org.springframework.stereotype.Service

@Service
class ForecastService (private val forecastRepository: ForecastRepository) {

    fun saveForecast(forecastRequest: ForecastRequest) {
        // Call external API and save forecast data to database
        val forecast = Forecast(
            location = forecastRequest.location,
            temperature = forecastRequest.temperature,
            description = forecastRequest.description
        )
        forecastRepository.save(forecast)
    }

    fun getAllForecasts(): List<Forecast> {
        return forecastRepository.findAll()
    }
}