package com.AssetManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

 public class Asset {

     private final String type;
     private final String status;
     private final String assignedTo;
     private final String availability;
     private final UUID id;

    public Asset( @JsonProperty("make") String type,
                 @JsonProperty("status") String status
            ,@JsonProperty("availability") String availability,
                 @JsonProperty("assigned_to") String assignedTo) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.status = status;
        this.assignedTo=assignedTo;
        this.availability = availability;
    }

     public UUID getId() {
         return id;
     }
     public String getType() {
         return type;
     }
     public String getStatus() {
         return status;
     }
     public String getAvailability() {
         return availability;
     }
     public String getAssignedTo() {return assignedTo;}
}
