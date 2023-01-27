package com.AssetManagement.model.electronics;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Laptop extends  Electronics {

    private final String make;
    private final String cpu;
    private final String ram;
    private final String dataStorage;

    public Laptop(String status,
                  String availability,
                  String assignedTo,
                  String serialNumber,
                  @JsonProperty("make") String make,
                  @JsonProperty("cpu") String cpu,
                  @JsonProperty("ram") String ram,
                  @JsonProperty("data_storage") String dataStorage) {
        super("Tower", status, availability, assignedTo, serialNumber);
        this.make = make;
        this.cpu = cpu;
        this.ram = ram;
        this.dataStorage = dataStorage;
    }

    public String getMake() {
        return make;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getDataStorage() {
        return dataStorage;
    }
}
