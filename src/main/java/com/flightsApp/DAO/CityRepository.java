package com.flightsApp.DAO;

import com.flightsApp.Models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
