package com.example.demo.dto;

import com.example.demo.domain.embeddable.Address;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
public class MatchStadiumDto {

    private final LocalDateTime start;
    private final String stadium;
    private final String stadiumCourt;

    private final Address address;

    private int price;
    

}
