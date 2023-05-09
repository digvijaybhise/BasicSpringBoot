package com.geekster.ApiECommerse.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String addressLandmark;
    private String addressPhoneNumber;
    private String zipCode;
    private String state;

    @ManyToOne(cascade = CascadeType.ALL)
    private Users user;
}
