package com.example.ss_2022_c1_e1.service;

import com.example.ss_2022_c1_e1.entities.WeatherApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WeatherService {
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String APP_ID = "f3be69323aed392270104c09306cbf35";

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public WeatherApiResponse getWeather(String city, String country) {
        String url = String.format("%s?q=%s,%s&appid=%s", BASE_URL, city, country, APP_ID);

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(WeatherApiResponse.class)
                .block();
    }
}

