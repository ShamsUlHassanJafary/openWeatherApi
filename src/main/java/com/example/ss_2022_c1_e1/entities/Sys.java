package com.example.ss_2022_c1_e1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sys {
    private int type;
    private String country;
    private long sunrise;
    private long sunset;

    @OneToOne(mappedBy = "sys")
    private WeatherApiResponse weatherResponse;
}
