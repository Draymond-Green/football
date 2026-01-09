package com.example.demo.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public enum MatchTeamSize {
    FIVE(5, "5vs5", List.of(Position.GK, Position.CB, Position.LM, Position.RM, Position.CF)),
    SIX(6, "6vs6", List.of(Position.GK, Position.CBL, Position.CBR, Position.LM, Position.RM, Position.CF)),
    EIGHT(8, "8vs8", List.of(Position.GK, Position.CB, Position.LB, Position.RB, Position.CM, Position.LM, Position.RM, Position.CF)),
    ELEVEN(11, "11vs11", List.of(Position.GK, Position.LB, Position.CBL, Position.CBR, Position.RB, Position.LM, Position.CM, Position.RM, Position.LW, Position.CF, Position.RW));

    private final int size;
    private final String displayName;
    private final List<Position> positions;

}
