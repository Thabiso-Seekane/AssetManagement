package com.AssetManagement.model.electronics;

import java.util.UUID;

public class Television extends Electronics {


    private final String make;

    //TODO add Specs , Constructor , Getters and Setters
    public Television( String type, String status, String make, String availability, String assignedTo, String serialNumber) {
        super(type, status, availability, assignedTo, serialNumber);
        this.make = make;
    }
}
