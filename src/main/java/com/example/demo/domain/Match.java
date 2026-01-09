package com.example.demo.domain;

import com.example.demo.domain.embeddable.MatchLevelStats;
import com.example.demo.domain.enums.*;
import com.example.demo.domain.enums.MatchLevel;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private MatchTeamSize matchTeamSize;
    private Integer minPeople;
    private Integer maxPeople;

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    @Enumerated(EnumType.STRING)
    private MatchDuration duration;

    private int price;

    @Embedded
    private MatchLevelStats stats;

    @Enumerated(EnumType.STRING)
    private MatchType matchType;

    @Enumerated(EnumType.STRING)
    private MatchSex matchSex;

    @Enumerated(EnumType.STRING)
    private MatchLevel matchLevel;

    @Enumerated(EnumType.STRING)
    private MatchStatus matchStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadiumCourt_id")
    private StadiumCourt stadiumCourt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Member manager;

    @OneToMany(mappedBy = "match")
    private List<MemberMatch> memberMatches = new ArrayList<>();

}
