package com.ngap.nonreactive.aircraft.utilities;


import com.ngap.nonreactive.aircraft.domain.aircraft;
import com.ngap.nonreactive.aircraft.repository.aircraftRepositoty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class AircraftDataInitializer implements CommandLineRunner
{
    final aircraftRepositoty aircraftRepository;

    public AircraftDataInitializer (aircraftRepositoty aircrafts) {
        this.aircraftRepository = aircrafts;
    
    }
  
    @Override
    public void run(String... args) throws Exception {

        
        this.aircraftRepository.save(new aircraft().buildAircraft("1"));
        this.aircraftRepository.save(new aircraft().buildAircraft("2"));
        this.aircraftRepository.save(new aircraft().buildAircraft("3"));




    }
}
