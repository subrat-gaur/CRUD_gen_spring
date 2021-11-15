package com.ngap.nonreactive.aircraft.domain;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONException;


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
        // String Data = '{"registrationNumber":"11","liveryCode":null,"serialNumber":null}'';
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
