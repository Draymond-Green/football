package com.example.demo.domain.enums;

import lombok.Getter;

@Getter
public enum Position {
    GK("골키퍼"),
    LB("레프트백"),
    CBL("레프트센터백"),
    CBR("라이트센터백"),
    CB("센터백"),
    RB("라이트백"),
    LM("레프트미드필더"),
    CM("중앙미드필더"),
    RM("라이트미드필더"),
    LW("레프트윙"),
    CF("센터포워드"),
    RW("라이트윙");

    private final String displayname;

    Position(String displayname) {
        this.displayname = displayname;
    }
}
