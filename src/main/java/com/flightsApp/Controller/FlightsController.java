package com.flightsApp.Controller;

import com.flightsApp.Models.Flight;
import com.flightsApp.Models.FlightInfo;
import com.flightsApp.Service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

//    @GetMapping("/flights/all/ids")
//    public List<Flight> getAllFlightsIds(){
//        List<Flight> flights = flightsService.getAllFlightsIds();
//        return flights;
//    }

    @GetMapping("/flights")
    public List<Flight> getAllFlightsByDepartureCity(@RequestBody FlightInfo flightInfo){
       List<Flight> flights = flightsService.getAllFlightsByDepartureCity(flightInfo.getDepart());
        return flights;
    }

    @GetMapping("/flights/all")
    public List<Flight> getAllFlightsByDepartureCityAndArrivalCity(@RequestBody FlightInfo flightInfo){
        System.out.println("print");
        List<Flight> flights = flightsService.getAllFlightsByDepartureCityAndArrivalCity(flightInfo.getDepart(), flightInfo.getArrive());
        return flights;
    }
}
