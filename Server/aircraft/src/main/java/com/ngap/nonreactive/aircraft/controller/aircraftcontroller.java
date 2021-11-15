package com.ngap.nonreactive.aircraft.controller;

import java.util.List;

import com.ngap.nonreactive.aircraft.domain.*;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aircraftcontroller {
    private final @NonNull aircraftDomainService aircraftDS;

    public aircraftcontroller(aircraftDomainService  AircraftService) {
        this.aircraftDS = AircraftService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/aircrafts")
    public List<aircraft> getaircrafts() {
        return aircraftDS.findAll();
    }
    // @CrossOrigin(origins = "http://localhost:4200")
    // @GetMapping("aircrafts/getaircraftsbySearchParameters/{_searchParameters}")
    // public List<aircraft> getaircraftsbySearchParameters(@PathVariable String _searchParameters ) {
    //     aircraftSearchParameters searchParameters = new aircraftSearchParameters(_searchParameters);
    //     // return aircraftDS.findAll();
    //     return aircraftDS.findbyCriteria(searchParameters);
    // }
    
}
