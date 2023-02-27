package com.example.ss_2022_c1_e1.controllers;

import com.example.ss_2022_c1_e1.entities.WeatherApiResponse;
import com.example.ss_2022_c1_e1.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


  private final WeatherService weatherService;

  @Autowired
  public DemoController(WeatherService weatherService) {
    this.weatherService = weatherService;
  }

  @GetMapping("/weather")
  public WeatherApiResponse getWeather(@RequestParam String city, @RequestParam String country) {
    return weatherService.getWeather(city, country);
  }
}
