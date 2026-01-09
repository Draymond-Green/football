package com.example.demo.domain.embeddable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class MatchLevelStats {
    private int unRankedCount;
    private int bronzeCount;
    private int silverCount;
    private int goldCount;
    private int platinumCount;
    private int diamondCount;
    private int challengerCount;
}
