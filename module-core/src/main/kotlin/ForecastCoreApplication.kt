package com.forecast

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForecastCoreApplication

fun main(args: Array<String>) {
    runApplication<ForecastCoreApplication>(*args)
}