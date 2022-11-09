package com.flightsApp.Service;

import com.flightsApp.DAO.CityRepository;
import com.flightsApp.Models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    public City getCityByName(String departureCity) {
        Optional<City> departure_city = cityRepo.findCityByName(departureCity);
        if(departure_city.isEmpty()){
            return null;
        }
        return departure_city.get();
    }
}
