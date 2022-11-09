package com.flightsApp.Controller;


import com.flightsApp.Models.City;
import com.flightsApp.Service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CitiesController {

    private final CitiesService citiesService;

    @Autowired
    public CitiesController(CitiesService citiesService){
        this.citiesService = citiesService;
    }

    @GetMapping("/cities/all")
    public List<City> getAllCities(){
        List<City> cities = citiesService.getAllCities();
        return cities;
    }

}
