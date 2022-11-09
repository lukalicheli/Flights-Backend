package com.flightsApp.Controller;

import com.flightsApp.Models.Flight;
import com.flightsApp.Models.FlightInfo;
import com.flightsApp.Service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FlightsController {

    private final FlightsService flightsService;

    @Autowired
    public FlightsController(FlightsService flightsService){
        this.flightsService = flightsService;
    }

//    @GetMapping("/flights/all/ids")
//    public List<Flight> getAllFlightsIds(){
//        List<Flight> flights = flightsService.getAllFlightsIds();
//        return flights;
//    }

    @PostMapping("/flights")
    public List<Flight> getAllFlightsByDepartureCity(@RequestBody FlightInfo flightInfo){
       List<Flight> flights = flightsService.getAllFlightsByDepartureCity(flightInfo.getDepart());
        return flights;
    }

    @PostMapping("/flights/all")
    public List<Flight> getAllFlightsByDepartureCityAndArrivalCity(@RequestBody FlightInfo flightInfo){
        System.out.println("print");
        List<Flight> flights = flightsService.getAllFlightsByDepartureCityAndArrivalCity(flightInfo.getDepart(), flightInfo.getArrive());
        return flights;
    }
}
