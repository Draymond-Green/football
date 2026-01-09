package com.example.demo.repository.member;

import com.example.demo.domain.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository

public class MemberRepositoryImpl implements MemberRepository {

    private final MemberSpringJpaRepository repository;
    private final JPAQueryFactory queryFactory;

    @Override
    public void save(Member member) {
        repository.save(member);
    }

    @Override
    public Member findById(String id) {

        Member member = repository.findByLoginId(id);
        return member;
    }

}
