package com.example.demo.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MemberLevel {
/*
    UN_RANKED("언랭", -1, 0, 0.0),
    BRONZE1("브론즈1", 0, 10, 1.0),
    */
/*BRONZE2("브론즈2", 10, 20, 1.3),
    BRONZE3("브론즈3", 20, 40, 1.7),
    *//*
SILVER1("실버1", 40, 60, 2.0),
    SILVER2("실버2", 60, 80, 2.3),
//    SILVER3("실버3", 80, 110, 2.7),
    GOLD1("골드1", 110, 130, 3.0),
    GOLD2("골드2", 130, 160, 3.3),
    GOLD3("골드3", 160, 210, 3.7),
    PLATINUM1("플래티넘1", 210, 250, 4.0),
    PLATINUM2("플래티넘2", 250, 300, 4.3),
    PLATINUM3("플래티넘3", 300, 350, 4.7),
    DIAMOND1("다이아몬드1", 350, 400, 5.0),
    DIAMOND2("다이아몬드2", 450, 500, 5.3),
    DIAMOND3("다이아몬드3", 500, 600, 5.7),
    CHALLENGER("챌린저", 350, 10000, 5.0);
*/

    UN_RANKED("언랭"),
    IRON("아이언"),
    BRONZE("브론즈"),
    SILVER("실버"),
    GOLD("골드"),
    EMERALD("에메랄드"),
    PLATINUM("플래티넘"),
    DIAMOND("다이아몬드"),
    MASTER("마스터"),
    GRANDMASTER("그랜드마스터"),
    CHALLENGER("챌린저");

    private final String displayName;
}
