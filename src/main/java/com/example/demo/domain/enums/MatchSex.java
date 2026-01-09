package com.example.demo.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MatchSex {
    ALL("남녀모두"),
    MAN_ONLY("남자만"),
    FEMALE_ONLY("여자만");

    private final String displayName;
}
