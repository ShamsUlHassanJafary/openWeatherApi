package com.example.ss_2022_c1_e1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherApiResponse {


    private int id;
    private Coord coord;
    private List<Weather> weather;

    private String base;

    private Main main;

    private int visibility;

    private Wind wind;

    private Clouds clouds;

    private long dt;

    private Sys sys;

    private int timezone;

}
