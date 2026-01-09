package com.example.demo.dto;

import com.example.demo.domain.enums.*;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class MyMatchDto {

    private Long matchId;
    private Long memberMatchId;
    private Long memberId;

    private String stadiumName;
    private String stadiumCourtName;

    private LocalDate date;
    private LocalTime startTime;

    private MatchSex sex;
    private MatchTeamSize teamSize;
    private MatchType type;
    private MatchLevel level;
    private MatchStatus status;

    private TeamColor teamColor;
    private MyBackNumber myBackNumber;

    @QueryProjection
    public MyMatchDto(Long matchId, Long memberMatchId, Long memberId, String stadiumName, String stadiumCourtName, LocalDate date, LocalTime startTime, MatchSex sex, MatchTeamSize teamSize, MatchType type, MatchLevel level, MatchStatus status, TeamColor teamColor, MyBackNumber myBackNumber) {
        this.matchId = matchId;
        this.memberMatchId = memberMatchId;
        this.memberId = memberId;
        this.stadiumName = stadiumName;
        this.stadiumCourtName = stadiumCourtName;
        this.date = date;
        this.startTime = startTime;
        this.sex = sex;
        this.teamSize = teamSize;
        this.type = type;
        this.level = level;
        this.status = status;
        this.teamColor = teamColor;
        this.myBackNumber = myBackNumber;
    }
}
