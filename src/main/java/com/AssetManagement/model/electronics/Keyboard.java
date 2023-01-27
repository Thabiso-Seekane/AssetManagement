package com.AssetManagement.model.electronics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Keyboard extends Electronics {

    private final String make;

    public Keyboard(String status,
                    String availability,
                    String assignedTo,
                    String serialNumber,
                    @JsonProperty("make") String make) {
        super( "Keyboard", status, availability, assignedTo, serialNumber);
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}

