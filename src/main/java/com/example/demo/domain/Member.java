package com.example.demo.domain;

import com.example.demo.domain.enums.MemberLevel;
import com.example.demo.domain.enums.MemberRole;
import com.example.demo.domain.enums.Sex;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String loginId;
    private String password;
    private String name;
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Enumerated(EnumType.STRING)
    private MemberLevel level;

    @Enumerated(EnumType.STRING)
    private MemberRole role;

    @Email
    private String email;

    @OneToMany(mappedBy = "member")
    private List<MemberMatch> memberMatches= new ArrayList<>();

    @OneToMany(mappedBy = "manager")
    private List<Match> matches = new ArrayList<>();


}
