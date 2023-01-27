package com.AssetManagement.model.furniture;

import com.AssetManagement.model.Asset;

import java.util.UUID;

public class Furniture extends Asset {

    private final String description;

    public Furniture(String status, String availability, String assignedTo, String description) {
        super( "furniture", status, availability, assignedTo);
        this.description= description;
    }
}
