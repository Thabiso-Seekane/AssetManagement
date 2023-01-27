package com.AssetManagement.model.electronics;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Monitor extends Electronics {

    private final String monitorSize;
    private  final String make;

    public Monitor(String status,
                   String availability,
                   String assignedTo,
                   String serialNumber,
                   @JsonProperty("monitor_size") String monitorSize,@JsonProperty("make") String make) {
        super( "Monitor", status, availability, assignedTo, serialNumber);
        this.monitorSize = monitorSize;
        this.make = make;
    }

    public String getMonitorSize() {
        return monitorSize;
    }
    public String getMake() {
        return make;
    }

}
