package com.flightsApp.Controller;

import com.flightsApp.Models.Flight;
import com.flightsApp.Service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin
public class FlightsController {

    private final FlightsService flightsService;

    @Autowired
    public FlightsController(FlightsService flightsService){
        this.flightsService = flightsService;
    }

    @GetMapping("/flights/all")
    public List<Flight> getAllFlights(){
        List<Flight> flights = flightsService.getAllFlights();
        return flights;
    }
}
