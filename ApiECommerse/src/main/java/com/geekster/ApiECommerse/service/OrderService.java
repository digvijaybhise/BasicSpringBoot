package com.geekster.ApiECommerse.service;

import com.geekster.ApiECommerse.model.Address;
import com.geekster.ApiECommerse.model.Orders;
import com.geekster.ApiECommerse.model.Product;
import com.geekster.ApiECommerse.model.Users;
import com.geekster.ApiECommerse.repository.IAddressRepo;
import com.geekster.ApiECommerse.repository.IOrdersRepo;
import com.geekster.ApiECommerse.repository.IProductRepo;
import com.geekster.ApiECommerse.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrdersRepo ordersRepo;

    @Autowired
    IUserRepo userRepo;

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IProductRepo productRepo;


    public void creteOrder(Orders orders) {

        Integer addressId = orders.getOrderAddress().getAddressId();
        Address address = addressRepo.getById(addressId);

        Integer productId = orders.getOrderProduct().getProductId();
        Product product = productRepo.getById(productId);

        Integer userId = orders.getOrderUser().getUserId();
        Users user = userRepo.getById(userId);

        ordersRepo.save(orders);
    }
}
