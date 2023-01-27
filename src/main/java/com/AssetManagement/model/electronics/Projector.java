package com.AssetManagement.model.electronics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Projector extends  Electronics {

    private final String make;

    //TODO add Specs , Constructor , Getters and Setters
    public Projector(String type, String status, @JsonProperty("make") String make, String availability, String assignedTo, String serialNumber)
    {
        super(type, status, availability, assignedTo, serialNumber);
        this.make = make;
    }

    public String getMake(){
        return make;
    }
}
