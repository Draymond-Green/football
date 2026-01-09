package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class MemberMatchDto {

    @JsonIgnore
    private Long matchId;

    @QueryProjection
    public MemberMatchDto(Long matchId) {
        this.matchId = matchId;
    }
}
