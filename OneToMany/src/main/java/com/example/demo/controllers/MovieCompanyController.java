package com.example.demo.controllers;

import com.example.demo.models.MovieCompany;
import com.example.demo.repositories.MovieCompanyRepository;
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

    @PostMapping
    public String createMovieCompany(@RequestParam String name) {
        MovieCompany company = movieCompanyRepository.save(new MovieCompany(name));
        return "redirect:/";
    }
}
