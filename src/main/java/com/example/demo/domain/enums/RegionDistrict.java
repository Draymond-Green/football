package com.example.demo.domain.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RegionDistrict {

    SEOUL1(Region.SEOUL, new String[]{"은평", "서대문", "마포"}),
    SEOUL2(Region.SEOUL, new String[]{"노원", "도봉", "성동", "성북", "광진", "광북", "동대문", "중랑"}),
    SEOUL3(Region.SEOUL, new String[]{"강남", "서초", "송파", "강동"}),
    SEOUL4(Region.SEOUL, new String[]{"강서", "양천", "영등포", "금천", "동작", "구로", "관악"}),
    SEOUL5(Region.SEOUL, new String[]{"종로", "중구", "용산"});

    private final Region region;
    private final String[] district;
}
