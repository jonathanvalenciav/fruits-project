package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PriceProductProvider {
    private Integer id;
    private Contact provider;
    private Product product;
    private Date initialDate;
    private Date endDate;
    private Double price;
    private Boolean status;
}
