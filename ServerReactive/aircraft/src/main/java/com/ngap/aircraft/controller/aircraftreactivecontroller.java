package com.ngap.aircraft.controller;

import com.ngap.aircraft.domain.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import lombok.NonNull;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class aircraftreactivecontroller {

    private final @NonNull aircraftDomainService aircraftDS;

    public aircraftreactivecontroller(aircraftDomainService  AircraftService) {
        this.aircraftDS = AircraftService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/aircrafts")
    public Flux<aircraft> getaircrafts() {
        return aircraftDS.findAll()
        // .log()
        ;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("aircrafts/getaircraftsbySearchParameters/{_searchParameters}")
    public Flux<aircraft> getaircraftsbySearchParameters(@PathVariable String _searchParameters ) {

        return aircraftDS.findbyCriteria(new aircraftSearchParameters(_searchParameters));
    }

}
