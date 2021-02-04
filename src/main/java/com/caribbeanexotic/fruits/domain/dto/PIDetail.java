package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class PIDetail {
    private Integer id;
    private Integer piHeader;
    private Integer product;
    private Integer quality;
    private Integer unitPrice;
    private Integer lot;
    private Double grossWeight;
    private Double netWeight;
    private Double packagingWeight;
    private Double packagingAmount;
    private Double dehydratedWeight;
    private Double totalPrice;
}
