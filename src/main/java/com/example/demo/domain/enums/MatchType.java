package com.example.demo.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MatchType {
    NORMAL("일반"),
    RANDOM("팀 자동배정");

    private final String displayName;
}
