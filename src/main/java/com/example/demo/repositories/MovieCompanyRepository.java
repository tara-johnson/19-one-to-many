package com.example.demo.repositories;

import com.example.demo.models.MovieCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCompanyRepository extends JpaRepository<MovieCompany, Long> {
}
