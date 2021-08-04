package com.ngap.aircraft.repository;

import com.ngap.aircraft.domain.aircraft;

import org.springframework.data.domain.Example;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;


@Component
@RequiredArgsConstructor
public interface aircraftReactiveRepository extends ReactiveCrudRepository<aircraft, Integer> {
    Flux<aircraft> findAll(Example<aircraft> example);
}