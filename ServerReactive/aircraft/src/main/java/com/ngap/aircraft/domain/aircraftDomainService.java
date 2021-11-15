package com.ngap.aircraft.domain;

import com.ngap.aircraft.repository.aircraftReactiveRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
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

        //Example<aircraft> employeeExample = Example.of(CreateQueryExample( _searchParameters));

        var result =reactiveRepository.findAll(CreateQueryExample( _searchParameters));
        //result.subscribe(i -> System.out.println(i));

        return result;
    }

    Example<aircraft> CreateQueryExample(aircraftSearchParameters _searchParameters)
    {
        var exampleaircraft  = new aircraft();
        // example.registrationNumber = _searchParameters.registrationNumber; 
        // example.liveryCode = _searchParameters.liveryCode;
        // example.serialNumber = _searchParameters.serialNumber;    
        
        exampleaircraft.registrationNumber = "17"; 
        exampleaircraft.liveryCode = "15";
        exampleaircraft.serialNumber = "19";   
        
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase()
        .withMatcher("registrationNumber", GenericPropertyMatcher::contains)
        .withMatcher("liveryCode", GenericPropertyMatcher::contains)
        .withMatcher("serialNumber", GenericPropertyMatcher::contains);
        
        Example<aircraft> example = Example.of(exampleaircraft, matcher);
        
        return example;
        
    }




}
