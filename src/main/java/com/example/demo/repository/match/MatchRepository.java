package com.example.demo.repository.match;

import com.example.demo.domain.Match;
import com.example.demo.dto.MatchDto;
import com.example.demo.dto.MyMatchDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long>, MatchRepositoryCustom{


/*
    List<MatchDto> findByDate(LocalDate date);

    List<MyMatchDto> findByMemberIdAndDate(Long memberId, LocalDate date);

    List<MyMatchDto> findByMemberIdAndDate(Long memberId, LocalDate startDate, LocalDate endDate);*/
}
