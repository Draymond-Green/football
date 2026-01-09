package com.example.demo.service.login;

import com.example.demo.dto.LoginForm;
import com.example.demo.domain.Member;
import com.example.demo.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LonginService {
    private final MemberRepository repository;

    public Long login(LoginForm loginForm) {
        String id = loginForm.getLoginId();
        String password = loginForm.getPassword();

        Member member = repository.findById(id);
        if (member == null || !member.getPassword().equals(password)) {
            return null;
        }

        return member.getId();
    }

}
