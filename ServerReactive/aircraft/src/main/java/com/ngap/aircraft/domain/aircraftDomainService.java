package com.ngap.aircraft.domain;



import com.ngap.aircraft.repository.aircraftReactiveRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


// import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
@Service
public class aircraftDomainService {
    

    private final @NonNull aircraftReactiveRepository reactiveRepository;
    

    public aircraftDomainService (aircraftReactiveRepository  reactiveRepository) {
        this.reactiveRepository = reactiveRepository;
        
    }

    public Flux<aircraft> findAll() {
        return reactiveRepository.findAll();
    }

    public Flux<aircraft> findbyCriteria(aircraftSearchParameters _searchParameters ) {

        aircraft _searchAircraft = new aircraft();
        _searchAircraft.registrationNumber = _searchParameters.registrationNumber;
        // _searchAircraft.liveryCode = _searchParameters.liveryCode;
        // _searchAircraft.serialNumber = _searchParameters.serialNumber;
        Example<aircraft> employeeExample = Example.of(_searchAircraft);

        return reactiveRepository.findAll(employeeExample);
    }




}
