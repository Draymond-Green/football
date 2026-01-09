package com.example.demo.repository.match;

import com.example.demo.domain.QMember;
import com.example.demo.domain.enums.*;
import com.example.demo.dto.*;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.Expression;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

import static com.example.demo.domain.QMatch.*;
import static com.example.demo.domain.QMember.member;
import static com.example.demo.domain.QMemberMatch.*;
import static com.example.demo.domain.QStadium.*;
import static com.example.demo.domain.QStadiumCourt.*;

@Repository
@RequiredArgsConstructor
public class MatchRepositoryImpl implements MatchRepositoryCustom{

    private final JPAQueryFactory factory;

    @Override
    public List<MatchSummaryDto> findByDateAndRegion(LocalDate date, Region region) {
        /*return factory.select(new QMatchSummaryDto(
                        match.id,
                        match.start,
                        stadium.name,
                        stadiumCourt.name,
                        match.matchSex,
                        match.matchTeamSize
                ))
                .from(match)
                .join(match.stadium, stadium)
                .join(match.stadiumCourt, stadiumCourt)
                .where(match.date.eq(date), match.matchStatus.eq(MatchStatus.BEFORE))
                .orderBy(
                        match.startTime.asc(),
                        match.stadium.name.asc()
                )
                .fetch();*/
        return null;
    }


    @Override
    public List<MatchSummaryDto> findByDateAndRegionDistrict(LocalDate date, RegionDistrict district) {
        return List.of();
    }

    @Override
    public Optional<MatchTotalDto> findByMatchId(Long matchId) {
        /*Tuple tuple = factory.select(
                        memberMatch.id.countDistinct(),
                        member.sex.when(Sex.FEMALE).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.UN_RANKED).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.IRON).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.BRONZE).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.SILVER).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.GOLD).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.PLATINUM).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.EMERALD).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.DIAMOND).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.MASTER).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.GRANDMASTER).then(1L).otherwise(0L).sum(),
                        member.level.when(MemberLevel.CHALLENGER).then(1L).otherwise(0L).sum()
                )
                .from(memberMatch)
                .join(memberMatch.member, member)
                .where(memberMatch.match.id.eq(matchId))
                .fetchOne();

        factory.select(
                Projections.constructor(
                        MatchTotalDto.class,
                        ExpressionUtils.as(
                                Projections.constructor(
                                        MatchDto.class,
                                        match.id,
                                        memberMatch.id,
                                        match.matchLevel,
                                        match.matchType,
                                        match.matchSex,
                                        match.matchTeamSize,
                                        Expressions.constant(tuple.get(0, Long.class)),
                                        Expressions.constant(tuple.get(1, Long.class)),
                                        Expressions.constant(tuple.get(2, Long.class)),
                                        Expressions.constant(tuple.get(3, Long.class)),
                                        Expressions.constant(tuple.get(4, Long.class)),
                                        Expressions.constant(tuple.get(5, Long.class)),
                                        Expressions.constant(tuple.get(6, Long.class)),
                                        Expressions.constant(tuple.get(7, Long.class)),
                                        Expressions.constant(tuple.get(8, Long.class)),
                                        Expressions.constant(tuple.get(9, Long.class)),
                                        Expressions.constant(tuple.get(10, Long.class)),
                                        Expressions.constant(tuple.get(11, Long.class)),
                                        Expressions.constant(tuple.get(12, Long.class)),
                                        Expressions.constant(tuple.get(13, Long.class)),
                                        match.manager.name,
                                        match.price,
                                        match.start,
                                        match.duration
                                ),
                                "matchDto"
                        ),
                        ExpressionUtils.as(
                                Projections.constructor(
                                        StadiumDto.class,
                                        stadium.id,
                                        stadium.name,
                                        stadium.address,
                                        stadium.isShowerRoom,
                                        stadium.isFreeParking,
                                        stadium.isFutsalShoeRental,
                                        stadium.isSellingDrink,
                                        stadium.isToilet
                                ),
                                "stadiumDto"
                        ),
                        ExpressionUtils.as(
                                Projections.constructor(
                                        StadiumCourtDto.class,
                                        stadiumCourt.id,
                                        stadiumCourt.name,
                                        stadiumCourt.courtWidth,
                                        stadiumCourt.courtLength
                                ),
                                "stadiumCourtDto"
                        )
                )
        )*/
        QMember manger = new QMember("manager");

        MatchTotalDto result = factory
                .select(Projections.constructor(
                        MatchTotalDto.class,
                        Projections.constructor(
                                MatchDto.class,
                                match.id,
                                memberMatch.id.countDistinct(),
                                member.sex.when(Sex.FEMALE).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.UN_RANKED).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.IRON).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.BRONZE).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.SILVER).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.GOLD).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.PLATINUM).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.EMERALD).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.DIAMOND).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.MASTER).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.GRANDMASTER).then(1L).otherwise(0L).sum(),
                                member.level.when(MemberLevel.CHALLENGER).then(1L).otherwise(0L).sum(),
                                manger.name,
                                match.price
                        ),
                        Projections.constructor(
                                StadiumDto.class,
                                stadium.id,
                                stadium.name,
                                stadium.address,
                                stadium.isShowerRoom,
                                stadium.isFreeParking,
                                stadium.isFutsalShoeRental,
                                stadium.isSellingDrink,
                                stadium.isToilet
                        ),
                        Projections.constructor(
                                StadiumCourtDto.class,
                                stadiumCourt.id,
                                stadiumCourt.name,
                                stadiumCourt.courtWidth,
                                stadiumCourt.courtLength
                        )
                ))
                .from(match)
                .join(match.stadium, stadium)
                .join(match.stadiumCourt, stadiumCourt)
                .join(match.manager, manger)
                .leftJoin(match.memberMatches, memberMatch)
                .leftJoin(memberMatch.member, member)
                .where(match.id.eq(matchId))
                .groupBy(match.id)
                .fetchOne();

        return Optional.ofNullable(result);
    }

    @Override
    public List<MatchSummaryDto> findByStadiumIdAndDate(Long stadiumId, LocalDate date) {

        return factory.select(new QMatchSummaryDto(
                        match.id,
                        match.date,
                        match.startTime,
                        stadium.name,
                        stadiumCourt.name,
                        match.matchSex,
                        match.matchTeamSize,
                        memberMatch.count()
                )).from(match)
                .join(match.stadium, stadium)
                .join(match.stadiumCourt, stadiumCourt)
                .join(match.memberMatches, memberMatch)
                .where(stadium.id.eq(stadiumId), match.date.eq(date))
                .groupBy(
                        match.id,
                        match.date,
                        match.startTime,
                        stadium.name,
                        match.matchSex,
                        match.matchTeamSize
                )
                .fetch();

    }
    /*@Override
    public List<MatchDto> findByDate(LocalDate date) {
        QMember manager = new QMember("manager");
        return factory.select(new QMatchDto(
                        match.id,
                        match.date,
                        match.startTime,
                        match.endTime,
                        match.stadium.name,
                        match.stadiumCourt.name,
                        match.matchSex,
                        match.matchType,
                        new QMemberDto()
                ))
                .from(match)
                .join(match.manager, manager).fetchJoin()
                .where(match.date.eq(date))
                .fetch();
    }

    @Override
    public List<MyMatchDto> findByMemberIdAndDate(Long memberId, LocalDate date) {
        return factory.select(new QMyMatchDto(
                        match.id,
                        memberMatch.id,
                        memberMatch.member.id,
                        match.stadium.name,
                        match.stadiumCourt.name,
                        match.date,
                        match.startTime,
                        match.matchSex,
                        match.matchTeamSize,
                        match.matchType,
                        match.matchLevel,
                        match.matchStatus,
                        memberMatch.teamColor,
                        memberMatch.myBackNumber

                ))
                .from(memberMatch)
                .join(memberMatch.match, match).fetchJoin()
                .where(memberMatch.member.id.eq(memberId), match.date.eq(date))
                .fetch();

    }

    @Override
    public List<MyMatchDto> findByMemberIdAndDate(Long memberId, LocalDate startDate, LocalDate endDate) {
        return factory.select(new QMyMatchDto(
                        match.id,
                        memberMatch.id,
                        memberMatch.member.id,
                        match.stadium.name,
                        match.stadiumCourt.name,
                        match.date,
                        match.startTime,
                        match.matchSex,
                        match.matchTeamSize,
                        match.matchType,
                        match.matchLevel,
                        match.matchStatus,
                        memberMatch.teamColor,
                        memberMatch.myBackNumber

                ))
                .from(memberMatch)
                .join(memberMatch.match, match).fetchJoin()
                .where(memberMatch.member.id.eq(memberId), match.date.between(startDate, endDate))
                .fetch();
    }

    *//*  @Override
    public List<MyMatchDto> findByMemberIdAndDate(Long memberId, LocalDate date) {
        List<MatchDto> result = getMatchDtos(memberId, match.date.eq(date));

        List<Long> matchIds = getMatchIds(result);

        List<MemberMatchDto> memberMatches = getMemberMatchDtos(matchIds);

        Map<Long, List<MemberMatchDto>> matchIdMap = memberMatches.stream()
                .collect(Collectors.groupingBy(MemberMatchDto::getMatchId));
        result.forEach(m -> m.setMemberMatches(matchIdMap.get(m.getMatchId())));

        return result;
    }

    private List<MemberMatchDto> getMemberMatchDtos(List<Long> matchIds) {
        List<MemberMatchDto> memberMatches = factory.select(new QMemberMatchDto(match.id))
                .from(memberMatch)
                .join(memberMatch.match, match)
                .where(match.id.in(matchIds))
                .fetch();
        return memberMatches;
    }

    private static List<Long> getMatchIds(List<MatchDto> result) {
        List<Long> matchIds = result.stream()
                .map(MatchDto::getMatchId)
                .collect(Collectors.toList());
        return matchIds;
    }

    private List<MatchDto> getMatchDtos(Long memberId, BooleanExpression date) {
        QMember manager = new QMember("manager");
        List<MatchDto> result = factory.select(new QMatchDto(match.id, match.date, match.startTime, match.endTime, new QStadiumDto(stadium), new QStadiumCourtDto(stadiumCourt), match.matchSex, match.matchType, new QMemberDto(manager)))
                .from(match)
                .join(match.stadium, stadium)
                .join(match.stadiumCourt, stadiumCourt)
                .join(match.manager, manager)
                .where(
                        match.id.eq(
                                JPAExpressions.select(memberMatch.match.id)
                                        .from(memberMatch)
                                        .where(memberMatch.member.id.eq(memberId))
                        ),
                        date
                )
                .fetch();
        return result;
    }

    @Override
    public List<MatchDto> findByMemberIdAndDate(Long memberId, LocalDate startDate, LocalDate endDate) {
        List<MatchDto> result = getMatchDtos(memberId, match.date.between(startDate, endDate));
        List<Long> matchIds = getMatchIds(result);
        List<MemberMatchDto> memberMatches = getMemberMatchDtos(matchIds);
        Map<Long, List<MemberMatchDto>> matchIdMap = memberMatches.stream()
                .collect(Collectors.groupingBy(MemberMatchDto::getMatchId));
        result.forEach(m -> m.setMemberMatches(matchIdMap.get(m.getMatchId())));

        return result;
    }*/
}
