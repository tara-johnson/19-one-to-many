package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HomepageController {
    @RequestMapping
    public String homepage() {
        return "index";
    }
}
