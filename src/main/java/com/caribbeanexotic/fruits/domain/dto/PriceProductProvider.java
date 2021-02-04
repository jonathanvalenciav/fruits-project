package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PriceProductProvider {
    private Integer id;
    private Integer provider;
    private Integer product;
    private Date initialDate;
    private Date endDate;
    private Double price;
    private Boolean status;
}
