package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class Contact {
    private Integer id;
    private String identificationNumber;
    private Integer identificationType;
    private Integer contactType;
    private Integer role;
    private String name;
    private String lastName;
    private String businessName;
    private String phoneNumber;
    private String emailAddress;
    private String vehiclePlate;
}
