package com.flightsApp.DAO;

import com.flightsApp.Models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Integer> {

    Optional<City> findCityByName(String name);

}
