package com.caribbeanexotic.fruits.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Contact {
    private Integer id;
    private String identificationNumber;
    private IdentificationType identificationType;
    private ContactType contactType;
    private Role role;
    private String name;
    private String lastName;
    private String businessName;
    private String phoneNumber;
    private String emailAddress;
    private String vehiclePlate;
}
