package com.flightsApp.Service;

import com.flightsApp.DAO.FlightRepository;
import com.flightsApp.Models.City;
import com.flightsApp.Models.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightsService {
    FlightRepository flightRepo;
    CitiesService cityService;
    @Autowired
    public FlightsService(FlightRepository flightRepo, CitiesService cityService) {
        this.flightRepo = flightRepo;
        this.cityService = cityService;
    }
    public List<Flight> getAllFlightsIds() {
        return flightRepo.findAll();
    }

//    public Map<String, String> getAllFlights() {
//        return flightRepo.findallFlights();
//    }

    public List<Flight> getAllFlightsByDepartureCity(String departCity) {
        City depart = cityService.getCityByName(departCity);
        return flightRepo.findAllFlightsByDepartureCity(depart);
    }

    public List<Flight> getAllFlightsByDepartureCityAndArrivalCity(String departCity, String arrivalCity) {
        City depart = cityService.getCityByName(departCity);
        City arrive = cityService.getCityByName(arrivalCity);
        return flightRepo.findAllFlightsByDepartureCityAndArrivalCity(depart, arrive);
    }


}
