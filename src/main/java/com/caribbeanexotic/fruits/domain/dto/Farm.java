package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class Farm {
    private Integer id;
    private String code;
    private String name;
    private String address;
    private Integer city;
    private String aICACertificate;
    private String globalGAPCertificate;
    private Integer provider;
}
