package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class MatchRoyal {

    @Id @GeneratedValue
    private Long id;

    private Integer teamSize;

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadiumCourt_id")
    private StadiumCourt stadiumCourt;

    @OneToMany(mappedBy = "matchRoyal")
    private List<MemberMatchRoyal> memberMatchRoyals= new ArrayList<>();

}
