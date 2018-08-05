package com.example.demo.repositories;

import com.example.demo.models.MovieCompany;
import com.example.demo.models.TheaterLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterLocationRepository extends JpaRepository<TheaterLocation, Long> {
}
