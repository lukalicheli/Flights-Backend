package com.flightsApp.DAO;

import com.flightsApp.Models.City;
import com.flightsApp.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {



//    @Query(
//            nativeQuery = true,
//            value =
//            "select x.departureCity, y.arrivalCity FROM (Select flights.id as flightid, cities.name as departureCity from flights inner join cities on flights.departure_city  = cities.id) as x inner join (select flights.id as flightid, cities.name as arrivalCity from flights inner join cities on flights.arrival_city  = cities.id) as y  on x.flightid = y.flightid;")
//
//
//
//    Map<String, String> findallFlights();

    List<Flight> findAllFlightsByDepartureCity(City departureCity);

    List<Flight> findAllFlightsByDepartureCityAndArrivalCity(City departureCity, City arrivalCity);

}
