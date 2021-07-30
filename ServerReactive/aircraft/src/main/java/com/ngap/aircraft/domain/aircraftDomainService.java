package com.ngap.aircraft.domain;

import com.ngap.aircraft.repository.aircraftReactiveRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

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

    public Flux<aircraft> findByliveryCode(String liveryCode) {
        return reactiveRepository.findByliveryCode(liveryCode);
    }
    public Flux<aircraft> findByserialNumber(String serialNumber) {
        return reactiveRepository.findByserialNumber(serialNumber);
    }

    public Flux<aircraft> findByregistrationNumberAndSerialNumberAndLiveryCode(String registrationNumber, String liveryCode, String serialNumber) {
        return reactiveRepository.findByregistrationNumberAndSerialNumberAndLiveryCode(registrationNumber,liveryCode, serialNumber);
    }


}
