package com.ruolan.weatherserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class WeatherserverApplication {

    fun main(args: Array<String>) {
        println("启动了..........")
        SpringApplication.run(WeatherserverApplication::class.java, *args)
    }

}
