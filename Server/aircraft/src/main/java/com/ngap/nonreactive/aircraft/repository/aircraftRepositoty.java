package com.ngap.nonreactive.aircraft.repository;

import com.ngap.nonreactive.aircraft.domain.aircraft;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public interface aircraftRepositoty extends CrudRepository<aircraft, Integer> {

}
