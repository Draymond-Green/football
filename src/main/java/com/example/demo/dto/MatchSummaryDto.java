package com.example.demo.dto;

import com.example.demo.domain.enums.MatchSex;
import com.example.demo.domain.enums.MatchTeamSize;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public record MatchSummaryDto(Long matchId, LocalDate date, LocalTime start, String stadiumName, String stadiumCourtName,
                              MatchSex sex, MatchTeamSize teamSize, Long count) {

    @QueryProjection
    public MatchSummaryDto {
    }
}
