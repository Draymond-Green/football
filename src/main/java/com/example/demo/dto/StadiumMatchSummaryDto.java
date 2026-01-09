package com.example.demo.dto;

import com.example.demo.domain.embeddable.Address;
import jakarta.persistence.Lob;

import java.util.List;

public record StadiumMatchSummaryDto(
        List<MatchSummaryDto> matches,
        Long stadiumId,
        Address address,
        @Lob String notice
) {
}
