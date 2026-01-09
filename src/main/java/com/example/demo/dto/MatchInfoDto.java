package com.example.demo.dto;

import lombok.Data;

@Data
public class MatchInfoDto {

    private String matchLevel;
    private String matchType;
    private String matchSex;
    private String matchTeamSize;
    private Integer minPeople;
    private Integer maxPeople;
    private String matchShoeType;
    private Integer womanCount;
    private String managerName;

}
