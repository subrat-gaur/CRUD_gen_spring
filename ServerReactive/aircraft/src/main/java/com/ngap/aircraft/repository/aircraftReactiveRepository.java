package com.ngap.aircraft.repository;

import com.ngap.aircraft.domain.aircraft;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public interface aircraftReactiveRepository extends ReactiveCrudRepository<aircraft, Integer>, ReactiveQueryByExampleExecutor<aircraft> {
    //Flux<aircraft> findAll(Example<aircraft> example);
}