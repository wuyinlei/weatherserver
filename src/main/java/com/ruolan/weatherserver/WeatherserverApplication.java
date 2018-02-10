package com.ruolan.weatherserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherserverApplication {

	public static void main(String[] args) {
		System.out.println("启动了..........");
		SpringApplication.run(WeatherserverApplication.class, args);
	}
}
