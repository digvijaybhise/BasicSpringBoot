package com.geekster.ApiECommerse.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders_table")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "orderId")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Integer productQuantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private Users orderUser;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product orderProduct;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address orderAddress;
}
