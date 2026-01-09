package com.example.demo.service.signUp;

import com.example.demo.domain.Member;
import com.example.demo.dto.SignUpForm;
//import com.example.demo.mapper.MemberMapper;
import com.example.demo.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpService {

    private final MemberRepository repository;
//    private final MemberMapper mapper;


}
