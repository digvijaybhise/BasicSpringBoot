package com.geekster.ApiECommerse.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders_table")
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
