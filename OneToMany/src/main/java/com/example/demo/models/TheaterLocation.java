package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theaterlocations")
public class TheaterLocation {
    @Id
    public Long id;
    public Long movieCompanyId;
    public String name;

    @Column(name="address")
    public String location;

    // required default constructor
    public TheaterLocation() {}

    public TheaterLocation(long movieCompanyId, String name, String location) {
        this.movieCompanyId = movieCompanyId;
        this.name = name;
        this.location = location;
    }
}
