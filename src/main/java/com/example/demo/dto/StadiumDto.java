package com.example.demo.dto;

import com.example.demo.domain.embeddable.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class StadiumDto {

    private final Long stadiumId;

    private final String name;

    private final Address address;
    private final boolean isShowerRoomPresent;
    private final boolean isFreeParking;
    private final boolean isFutsalShoeRentalAvailable;
    private final boolean isSellingDrink;
    private final boolean isToiletAvailable;
}
