package com.geekster.ApiECommerse.service;

import com.geekster.ApiECommerse.model.Address;
import com.geekster.ApiECommerse.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;


    public void addAddress(Address address) {
        addressRepo.save(address);
    }
}
