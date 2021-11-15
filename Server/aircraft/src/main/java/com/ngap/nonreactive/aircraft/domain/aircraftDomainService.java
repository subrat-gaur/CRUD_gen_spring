package com.ngap.nonreactive.aircraft.domain;

import java.util.List;

import com.ngap.nonreactive.aircraft.repository.aircraftRepositoty;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Service
public class aircraftDomainService {

    private final @NonNull aircraftRepositoty repository;
    

    public aircraftDomainService (aircraftRepositoty  Repository) {
        this.repository = Repository;
        
    }

    public List<aircraft> findAll() {
        return (List<aircraft>) repository.findAll() ;
    }

    // public List<aircraft> findbyCriteria(aircraftSearchParameters _searchParameters ) {

    //     aircraft _searchAircraft = new aircraft();
    //     _searchAircraft.registrationNumber = _searchParameters.registrationNumber;
    //     // _searchAircraft.liveryCode = _searchParameters.liveryCode;
    //     // _searchAircraft.serialNumber = _searchParameters.serialNumber;
    //     Example<aircraft> employeeExample = Example.of(_searchAircraft);

    //     return repository.findAll(employeeExample);
    // }
}
