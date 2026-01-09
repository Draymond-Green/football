package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Entity
@Getter
public class StadiumCourtContract {

    @Id @GeneratedValue
    private Long Id;

    @Enumerated(EnumType.STRING)
    private DayOfWeek date;


    private LocalDate startContract;
    private LocalDate endContract;

    private String contractDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadiumCorut_id")
    private StadiumCourt stadiumCourt;
}
