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
        Address address = addressRepo.findById(addressId).get();

        Integer productId = orders.getOrderProduct().getProductId();
        Product product = productRepo.findById(productId).get();

        Integer userId = orders.getOrderUser().getUserId();
        Users user = userRepo.findById(userId).get();

        if(address != null && product != null && user != null){
            orders.setOrderProduct(product);
            orders.setOrderAddress(address);
            orders.setOrderUser(user);

            ordersRepo.save(orders);
        }else {
            throw new IllegalStateException("Please fill the valid details");
        }
    }

    public Orders getById(Long orderId) {
        return ordersRepo.findById(orderId).get();
    }
}
