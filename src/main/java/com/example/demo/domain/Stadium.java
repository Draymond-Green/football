package com.example.demo.domain;

import com.example.demo.domain.embeddable.Address;
import com.example.demo.domain.enums.Region;
import com.example.demo.domain.enums.RegionDistrict;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stadium {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @Email
    private String email;

    private String phoneNumber;

    private boolean isShowerRoom;
    private boolean isFreeParking;
    private boolean isFutsalShoeRental;
    private boolean isSellingDrink;
    private boolean isToilet;
    private boolean isToiletGender;
    private String note;


    @OneToMany(mappedBy = "stadium")
    private List<StadiumCourt> stadiumCourts= new ArrayList<>();

    @OneToMany(mappedBy = "stadium")
    private List<Match> matches = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Region region;
    @Enumerated(EnumType.STRING)
    private RegionDistrict district;
}
