package com.example.demo.dto;

import com.example.demo.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberLoginDto {

    private Long memberId;

    private String loginId;

    private String name;

    public MemberLoginDto(Member member) {
        this.memberId = member.getId();
        this.loginId = member.getLoginId();
        this.name = member.getName();
    }
}
