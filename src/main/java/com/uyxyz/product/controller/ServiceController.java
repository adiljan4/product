package com.uyxyz.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/PI")
    public String productInterface(){

        return " this is product info ! ";
    }

}
