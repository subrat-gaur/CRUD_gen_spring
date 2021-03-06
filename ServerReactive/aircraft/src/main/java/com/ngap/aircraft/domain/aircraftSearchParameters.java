package com.ngap.aircraft.domain;


import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class aircraftSearchParameters {
    public String registrationNumber;
    public String liveryCode;
    public String serialNumber;

    public aircraftSearchParameters(String input) 
    {
        
        JSONObject jsoncriteria = null;
        try {
            jsoncriteria = new JSONObject(input);
            this.registrationNumber = jsoncriteria.getString("registrationNumber");
            this.liveryCode = jsoncriteria.getString("liveryCode");
            this.serialNumber = jsoncriteria.getString("serialNumber");
        } catch (JSONException e) {
            
            e.printStackTrace();
        }
    }
}
