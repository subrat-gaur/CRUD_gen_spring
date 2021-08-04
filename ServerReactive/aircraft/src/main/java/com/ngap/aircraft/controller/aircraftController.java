package com.ngap.aircraft.controller;

import com.ngap.aircraft.domain.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import lombok.NonNull;
import reactor.core.publisher.Flux;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class aircraftController {

    private final @NonNull aircraftDomainService aircraftDS;

    public aircraftController(aircraftDomainService  AircraftService) {
        this.aircraftDS = AircraftService;
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/aircrafts")
    public Flux<aircraft> getaircrafts() {
        return aircraftDS.findAll();
    }

    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("aircrafts/getaircraftsbySearchParameters/{_searchParameters}")
    public Flux<aircraft> getaircraftsbySearchParameters(@PathVariable String _searchParameters ) {
        aircraftSearchParameters searchParameters = new aircraftSearchParameters(_searchParameters);
        // return aircraftDS.findAll();
        return aircraftDS.findbyCriteria(searchParameters);
    }

}