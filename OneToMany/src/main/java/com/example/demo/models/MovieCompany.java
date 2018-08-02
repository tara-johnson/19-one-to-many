package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviecompanies")
public class MovieCompany {
    @Id
    Long id;
    String name;
}
