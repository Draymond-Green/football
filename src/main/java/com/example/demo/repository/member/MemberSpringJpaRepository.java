package com.example.demo.repository.member;

import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSpringJpaRepository extends JpaRepository<Member, Long> {
    Member findByLoginId(String id);
}


