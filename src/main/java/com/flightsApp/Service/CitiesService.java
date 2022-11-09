package com.flightsApp.Service;

import com.flightsApp.DAO.CityRepository;
import com.flightsApp.Models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CitiesService {

    CityRepository cityRepo;

    @Autowired
    public CitiesService(CityRepository cityRepo){
        this.cityRepo = cityRepo;
    }

    public List<City> getAllCities() {
        return cityRepo.findAll();
    }
}
