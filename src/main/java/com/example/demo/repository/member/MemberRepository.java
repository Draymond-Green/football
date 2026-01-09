package com.example.demo.repository.member;

import com.example.demo.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(String id);

}
