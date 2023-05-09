package com.geekster.UrlHitCounter.controller;

import com.geekster.UrlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;
    @GetMapping("/username/{userName}/count")
    public String urlHitCounter (@PathVariable String userName){
        return urlHitService.hitCount(userName);
    }
}
