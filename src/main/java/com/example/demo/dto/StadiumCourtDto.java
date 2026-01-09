package com.example.demo.dto;

import com.example.demo.domain.StadiumCourt;
import com.example.demo.domain.enums.MatchTeamSize;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class StadiumCourtDto {

    private Long stadiumCourtId;

    private String name;

    private int courtWidth;
    private int courtLength;

}
