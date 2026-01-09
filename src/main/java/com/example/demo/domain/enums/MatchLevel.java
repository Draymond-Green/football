package com.example.demo.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MatchLevel {
    EASY("골드1 이하"),
    NORMAL("모든 레벨"),
    HARD("골드2 이상");

    private final String displayName;
}
