package com.ngap.aircraft.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class aircraftSearchResult {
    public String registrationNumber;
    public String liveryCode;
    public String serialNumber;
}




