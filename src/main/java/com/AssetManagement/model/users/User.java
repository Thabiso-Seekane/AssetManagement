package com.AssetManagement.model.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String firstName;
    private  final String lastName;
    private final String email;
    private  final String department;//e.g Tech department / UI Design department
    private  final String reportingTo;//Manager / scrum master
    private final int employeeNumber;//meant for staff memebers And recruits
    private final String productTeam; //If in a product team or the preferred Product team / will be nullified if not applicable
    private  final String cohort;//cohort as e.g C14-web or C14-data || C18-web or C18-java / will be nullified if not applicable
    private final String role;//e.g manager,operations_manager,juniorStaff, Technical | Technical_Assistant_staff / recruit e.t.c.

    public User(@JsonProperty("id") UUID id,
                @JsonProperty("first_name") String firstName,
                @JsonProperty("last_name") String lastName,
                @JsonProperty("email") String email,
                @JsonProperty("department") String department,
                @JsonProperty("reportingTo") String reportingTo,
                @JsonProperty("employeeNumber") int employeeNumber,
                @JsonProperty("role") String role,
                @JsonProperty("cohort") String cohort,
                @JsonProperty("productTeam") String productTeam) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.reportingTo = reportingTo;
        this.employeeNumber=employeeNumber;
        this.role=role;
        this.productTeam = productTeam;
        this.cohort = cohort;
    }

    public UUID getId() { return id;
    }
    public String getFirstName() { return firstName;
    }
    public String getLastName() { return lastName;
    }
    public String getEmail() { return email;
    }
    public String getDepartment() { return department;
    }
    public String getReportingTo() { return reportingTo;
    }
    public int getEmployeeNumber() { return employeeNumber;
    }
    public String getRole() { return role;
    }
    public String getProductTeam() { return productTeam;
    }
    public String getCohort() { return cohort;
    }

}