package com.flightsApp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="departure_id", referencedColumnName = "id")
    private City departureCity;
    @ManyToOne
    @JoinColumn(name="arrival_id", referencedColumnName = "id")
    private City arrivalCity;
}
