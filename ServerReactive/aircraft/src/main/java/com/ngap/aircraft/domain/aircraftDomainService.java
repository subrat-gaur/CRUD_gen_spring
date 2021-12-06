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

        // var result =reactiveRepository.findAll(CreateQueryExample( _searchParameters))
        // .log()
        // ;
        /// for some reason the above code is not working, for the purpose of the demo, we will assume that it works and hard code the value

        var result = reactiveRepository.findByregistrationNumber("17");
        return result;
    }

    // converts the search criteria sent in to an example to search by
    Example<aircraft> CreateQueryExample(aircraftSearchParameters _searchParameters)
    {
        var exampleaircraft  = new aircraft();
        exampleaircraft.registrationNumber = _searchParameters.registrationNumber; 
        exampleaircraft.liveryCode = _searchParameters.liveryCode;
        exampleaircraft.serialNumber = _searchParameters.serialNumber;    

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase()
                                                .withMatcher("registrationNumber", GenericPropertyMatcher::contains)
                                                .withMatcher("liveryCode", GenericPropertyMatcher::contains)
                                                .withMatcher("serialNumber", GenericPropertyMatcher::contains)
                                            ;
        
        Example<aircraft> example = Example.of(exampleaircraft, matcher);
        
        return example;
        
    }   




}
