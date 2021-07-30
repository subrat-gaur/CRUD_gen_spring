package com.ngap.aircraft.Utilities;


import com.ngap.aircraft.domain.aircraft;
import com.ngap.aircraft.repository.aircraftReactiveRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;





@Component
@Slf4j
@RequiredArgsConstructor
public class AircraftDataInitializer implements CommandLineRunner
{
    final aircraftReactiveRepository aircraftRepository;

    public AircraftDataInitializer (aircraftReactiveRepository aircrafts) {
        this.aircraftRepository = aircrafts;
    
    }
  
    @Override
    public void run(String... args) throws Exception {

        
        this.aircraftRepository.save(new aircraft().buildAircraft("1")).subscribe();
        this.aircraftRepository.save(new aircraft().buildAircraft("2")).subscribe();
        this.aircraftRepository.save(new aircraft().buildAircraft("3")).subscribe();
                               
        



    }
}
