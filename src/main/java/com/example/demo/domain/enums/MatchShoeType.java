package com.example.demo.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MatchShoeType {
    FUTSAL("풋살화/운동화(축구화 금지)"),
    SOCCER("축구화");

    private final String displayName;

}
