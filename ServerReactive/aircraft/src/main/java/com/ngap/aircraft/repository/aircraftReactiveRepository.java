package com.ngap.aircraft.repository;

import com.ngap.aircraft.domain.aircraft;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;


@Component
@RequiredArgsConstructor
public interface aircraftReactiveRepository extends ReactiveCrudRepository<aircraft, Integer> {
    Flux<aircraft> findByregistrationNumber(String registrationNumber);
    Flux<aircraft> findByliveryCode(String liveryCode);
    Flux<aircraft> findByserialNumber(String serialNumber);
    Flux<aircraft> findByregistrationNumberAndSerialNumberAndLiveryCode(String registrationNumber, String liveryCode, String serialNumber);
}