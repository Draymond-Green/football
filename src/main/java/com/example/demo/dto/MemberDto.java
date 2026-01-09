package com.example.demo.dto;

import com.example.demo.domain.Member;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {

    private Long memberId;

    private String name;

    List<MemberMatchDto> memberMatches = new ArrayList<>();

    @QueryProjection
    public MemberDto(Member member) {
        this.memberId = member.getId();
        this.name = member.getName();
    }

    @QueryProjection
    public MemberDto(Long memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}
