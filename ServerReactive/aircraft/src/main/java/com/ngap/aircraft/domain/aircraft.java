package com.ngap.aircraft.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("Aircrafts")
public class aircraft {
    @Id
    @Column("id")
    public int id;
    
    @Column("registrationNumber")
    public String registrationNumber;

    @Column("typeIATACode")
    public String typeIATACode;

    @Column("aircraftName")
    public String aircraftName;

    @Column("aircraftName")
    public String ownershipTypeCode;
    
    @Column("aircraftOwner")
    public String aircraftOwner;

    @Column("liveryCode")
    public String liveryCode;

    @Column("serialNumber")
    public String serialNumber;

    @Column("engineManufacturer")
    public String engineManufacturer;
    
    @Column("engineModel")
    public String engineModel;
    
    @Column("remarks")
    public String remarks;

    @Column("AircraftWeight")
    public String AircraftWeight;

    public aircraft buildAircraft(String value)
    {
        var objAircraft = new aircraft();
        objAircraft.aircraftName = value;
        objAircraft.aircraftOwner = value;
        objAircraft.engineManufacturer = value;
        objAircraft.engineModel = value;
        objAircraft.liveryCode = value;
        objAircraft.ownershipTypeCode = value;
        objAircraft.registrationNumber = value;
        objAircraft.remarks = value;
        objAircraft.serialNumber = value;
        objAircraft.typeIATACode = value;
        objAircraft.AircraftWeight = value;

        return objAircraft;

    }
}
   

