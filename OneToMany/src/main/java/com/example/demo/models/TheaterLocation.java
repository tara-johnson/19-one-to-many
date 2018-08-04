package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "theaterlocations")
public class TheaterLocation {
    @Id
    public Long id;
    @Column(name = "moviecompanyid")
    public Long movieCompanyId;
    public String name;
    public String location;

    // required default constructor
    public TheaterLocation() {}

    public TheaterLocation(long movieCompanyId, String name, String location) {
        this.movieCompanyId = movieCompanyId;
        this.name = name;
        this.location = location;
    }
}