package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class StadiumCourt {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private int courtWidth;
    private int courtLength;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @OneToMany(mappedBy = "stadiumCourt")
    private List<Match> matches= new ArrayList<>();
}
