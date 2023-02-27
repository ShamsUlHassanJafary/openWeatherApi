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

public class Wind {

    private int id;
    private double speed;
    private int deg;

}