package com.example.demo.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MatchDuration {

    ONE_HOUR(60, "1시간"),
    TWO_HOUR(120, "2시간");

    private final int minutes;
    private final String displayName;
}
