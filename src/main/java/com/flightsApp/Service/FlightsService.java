package com.flightsApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import com.flightsApp.DAO.FlightRepository;
import com.flightsApp.Models.Flight;

@Component
public class FlightsService {
    FlightRepository flightRepo;
    @Autowired
    public FlightsService(FlightRepository flightRepo) {
        this.flightRepo = flightRepo;
    }
    public List<Flight> getAllFlights() {
        return flightRepo.findAll();
    }
}
