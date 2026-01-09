package com.example.demo.dto;

import com.example.demo.domain.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class MatchDto {

    private final Long matchId;
    private Long memberMatchId;

    private final MatchLevel matchLevel;
    private MatchType matchType;
    private final MatchSex matchSex;
    private final MatchTeamSize matchTeamSize;

    private Long playerCount;
    private Long femaleCount;

    private final Long ironCount;
    private final Long bronzeCount;
    private final Long silverCount;
    private final Long goldCount;
    private final Long platinumCount;
    private final Long emeraldCount;
    private final Long masterCount;
    private final Long grandMasterCount;
    private final Long challengerCount;

    private String managerName;

    private Long price;
    private final LocalDateTime start;
    private final MatchDuration duration;


}
