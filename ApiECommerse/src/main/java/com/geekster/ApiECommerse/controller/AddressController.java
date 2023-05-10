package com.geekster.ApiECommerse.controller;

import com.geekster.ApiECommerse.model.Address;
import com.geekster.ApiECommerse.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping()
    public void saveAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

}
