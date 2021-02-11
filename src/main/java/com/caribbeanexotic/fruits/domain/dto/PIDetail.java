package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class PIDetail {
    private Integer id;
    private PIHeader PIHeader;
    private Product product;
    private Quality quality;
    private PriceProductProvider unitPrice;
    private Integer lot;
    private Double grossWeight;
    private Double netWeight;
    private Double packagingWeight;
    private Double packagingAmount;
    private Double dehydratedWeight;
    private Double totalPrice;
}
