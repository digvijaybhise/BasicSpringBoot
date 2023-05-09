package com.geekster.RestaurantManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Restaurant {

    private int rId;
    private String rName;
    private String rAddress;
    private String rNumber;
    private String rSpeciality;
    private int rTotalStaff;

}
