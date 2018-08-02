package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "moviecompanies")
public class MovieCompany {
    @Id
    @GeneratedValue
    @SequenceGenerator(name = "movie-company-generator")
    public Long id;
    public String name;

    // required default constructor
    public MovieCompany() {}

    public MovieCompany(String name) {
        this.name = name;
    }
}
