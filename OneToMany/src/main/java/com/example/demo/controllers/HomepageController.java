package com.example.demo.controllers;

import com.example.demo.models.MovieCompany;
import com.example.demo.models.TheaterLocation;
import com.example.demo.repositories.MovieCompanyRepository;
import com.example.demo.repositories.TheaterLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping
public class HomepageController {
    @Autowired
    MovieCompanyRepository movieCompanyRepository;

    @Autowired
    TheaterLocationRepository theaterLocationRepository;

    @RequestMapping
    public String homepage(Model model) {
        List<MovieCompany> companies = movieCompanyRepository.findAll();
        List<TheaterLocation> theaters = theaterLocationRepository.findAll();

        model.addAttribute("companies", companies);
        model.addAttribute("theaters", theaters);

        return "index";
    }
}
