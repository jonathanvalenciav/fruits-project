package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class Farm {
    private Integer id;
    private String code;
    private String name;
    private String address;
    private City city;
    private String ICACertificate;
    private String globalGAPCertificate;
    private Contact provider;
}
