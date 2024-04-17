package com.forecast

import com.forecast.domain.ForecastService
import com.forecast.domain.dto.ForecastRequest
import com.forecast.domain.entity.Forecast
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/forecasts")
class ForecastController(private val forecastService: ForecastService) {

    @PostMapping
    fun saveForecast(@RequestBody forecastRequest: ForecastRequest): ResponseEntity<Unit> {
        forecastService.saveForecast(forecastRequest)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping
    fun getForecasts(): ResponseEntity<List<Forecast>> {
        val forecasts = forecastService.getAllForecasts()
        return if (forecasts.isEmpty()) {
            ResponseEntity(HttpStatus.NO_CONTENT)
        } else {
            ResponseEntity.ok(forecasts)
        }
    }
}