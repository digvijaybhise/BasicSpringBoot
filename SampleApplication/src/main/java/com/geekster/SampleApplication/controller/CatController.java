package com.geekster.SampleApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @GetMapping("/cat")
    public String getCatInfo(){
        return "This is Cat Controller";
    }
}
