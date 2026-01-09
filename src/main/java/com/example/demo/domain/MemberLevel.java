package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class MemberLevel {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "memberLevel")
    private List<MatchLevel> matchLevels= new ArrayList<>();
}
