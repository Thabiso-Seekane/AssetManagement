package com.AssetManagement.model.electronics;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Mouse extends Electronics {

    private final String make;

    public Mouse(String status,
                 String availability,
                 String assignedTo,
                 String serialNumber,@JsonProperty("make") String make) {
        super( "Mouse", status, availability, assignedTo, serialNumber);
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
