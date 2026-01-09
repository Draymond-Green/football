package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchLevelStatsDto {
    private int unRankedCount;
    private int bronzeCount;
    private int silverCount;
    private int goldCount;
    private int platinumCount;
    private int diamondCount;
    private int challengerCount;
}
