package com.example.demo.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Sex {

    MAN("남자"),
    FEMALE("여자");

    private final String displayName;
}
