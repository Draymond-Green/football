package com.example.demo.repository.match;

import com.example.demo.domain.enums.Region;
import com.example.demo.domain.enums.RegionDistrict;
import com.example.demo.dto.MatchTotalDto;
import com.example.demo.dto.MatchSummaryDto;
import com.example.demo.dto.StadiumMatchSummaryDto;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MatchRepositoryCustom {


    List<MatchSummaryDto> findByDateAndRegion(LocalDate date, Region region);

    List<MatchSummaryDto> findByDateAndRegionDistrict(LocalDate date, RegionDistrict district);

    Optional<MatchTotalDto> findByMatchId(Long matchId);

    List<MatchSummaryDto> findByStadiumIdAndDate(Long stadiumId, LocalDate date);
}
