package com.example.demo.domain;

import com.example.demo.domain.enums.MatchLevel;
import com.example.demo.domain.enums.MemberLevel;
import com.example.demo.domain.enums.MyBackNumber;
import com.example.demo.domain.enums.TeamColor;
import jakarta.persistence.*;
import lombok.Getter;
import org.mapstruct.Mapper;

import java.util.List;

@Entity
@Getter
@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"match_id", "member_id"})
        }
)
public class MemberMatch {

    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private TeamColor teamColor;

    @Enumerated(EnumType.STRING)
    private MyBackNumber myBackNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Match match;

}
