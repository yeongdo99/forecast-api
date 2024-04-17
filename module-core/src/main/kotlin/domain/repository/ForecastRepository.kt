package com.forecast.domain.repository

import com.forecast.domain.entity.Forecast
import org.springframework.data.jpa.repository.JpaRepository

interface ForecastRepository : JpaRepository<Forecast, Long>
