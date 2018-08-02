package com.example.demo.controllers;

import com.example.demo.models.MovieCompany;
import com.example.demo.models.TheaterLocation;
import com.example.demo.repositories.MovieCompanyRepository;
import com.example.demo.repositories.TheaterLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.PostRemove;

@Controller
@RequestMapping("/moviecompanies")
public class MovieCompanyController {
    @Autowired
    MovieCompanyRepository movieCompanyRepository;

    @Autowired
    TheaterLocationRepository theaterLocationRepository;

    @PostMapping
    public String createMovieCompany(@RequestParam String name) {
        MovieCompany company = movieCompanyRepository.save(new MovieCompany(name));
        return "redirect:/";
    }

    @PostMapping("add-location")
    public String addTheaterLocation(
    ) {
        System.out.println("Succesfully hit add-location controller");
        return "redirect:/";
    }
}
