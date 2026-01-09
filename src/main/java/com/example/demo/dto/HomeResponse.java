package com.example.demo.dto;

import com.example.demo.domain.enums.Region;

import java.time.LocalDate;
import java.util.List;

public record HomeResponse(LocalDate date, Region region, List<LocalDate> dates, List<MatchSummaryDto> matches) {
    public HomeResponse(LocalDate date, Region region, List<LocalDate> dates, List<MatchSummaryDto> matches) {
        this.date = date;
        this.region = region;
        this.dates = dates;
        this.matches = matches;
    }
}
