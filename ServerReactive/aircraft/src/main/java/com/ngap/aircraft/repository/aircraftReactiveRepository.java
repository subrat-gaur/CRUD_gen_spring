package com.ngap.aircraft.repository;

import com.ngap.aircraft.domain.aircraft;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;


@Component
@RequiredArgsConstructor
public interface aircraftReactiveRepository extends ReactiveCrudRepository<aircraft, String>, ReactiveQueryByExampleExecutor<aircraft> {
    //Flux<aircraft> findAll(Example<aircraft> example);
    Flux<aircraft> findByregistrationNumber(String reg);
}