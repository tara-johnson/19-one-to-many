package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theaterlocations")
public class TheaterLocation {
    @Id
    Long id;
    Long movieCompanyId;
    String name;
    String location;
}
