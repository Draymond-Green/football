package com.example.demo.dto;

import lombok.Data;

@Data
public class StadiumInfoDto {

    private boolean isShowerRoomPresent;
    private boolean isFreeParking;
    private boolean isFutsalShoeRentalAvailable;
    private boolean isSellingDrink;

    private String stadiumCourtName;
    private int courtWidth;
    private int courtLength;

    private String note;
}
