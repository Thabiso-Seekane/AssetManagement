package com.AssetManagement.model.electronics;

import com.AssetManagement.model.Asset;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class
Electronics extends Asset {

    private  final String serialNumber;

    public Electronics(String type,
                       String status,
                       String availability,
                       String assignedTo,
                       @JsonProperty("serial_number") String serialNumber) {

        super(type, status, availability, assignedTo);
        this.serialNumber = serialNumber;

    }

    public String getSerialNumber() {
        return serialNumber;
    }

}
