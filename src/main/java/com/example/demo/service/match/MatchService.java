package com.example.demo.service.match;

import com.example.demo.domain.enums.Region;
import com.example.demo.dto.HomeResponse;
import com.example.demo.dto.MatchSummaryDto;
import com.example.demo.dto.MatchTotalDto;
import com.example.demo.ex.NoMatchException;
import com.example.demo.repository.match.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final MatchRepository repository;

    public HomeResponse getMatchSummaryByDateAndRegion(LocalDate date, Region region) {
        LocalDate today= LocalDate.now();
        if (date == null || date.isBefore(today)|| date.isAfter(today.plusDays(14))) {
            date= today;
        }
        if (region == null) {
            region= Region.SEOUL;
        }

        List<LocalDate> dates= new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            dates.add(today.plusDays(i));
        }

        List<MatchSummaryDto> matches = repository.findByDateAndRegion(date, region);
        return new HomeResponse(date, region, dates, matches);
    }

    public MatchTotalDto getMatchTotal(Long matchId) {
        return repository.findByMatchId(matchId).orElseThrow(NoMatchException::new);
    }

    public List<MatchSummaryDto> getMatchSummary(Long stadiumId, LocalDate date) {
        return repository.findByStadiumIdAndDate(stadiumId, date);
    }


/*
    @Override
    public List<MatchDto> getMatchDtoByDate(LocalDate date) {
        repository.findby
        return List.of();
    }

    @Override
    public List<MyMatchDto> getMyMatchByMemberIdAndDate(Long memberId, LocalDate date) {
        return repository.findByMemberIdAndDate(memberId, date);
    }

    @Override
    public List<MyMatchDto> getMyMatchByMemberIdAndDate(Long memberId, LocalDate startDate, LocalDate endDate) {
        return repository.findByMemberIdAndDate(memberId, startDate, endDate);
    }*/
}
