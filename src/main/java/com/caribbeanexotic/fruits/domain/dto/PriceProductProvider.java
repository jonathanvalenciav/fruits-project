package com.caribbeanexotic.fruits.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.Date;

@Data
public class PriceProductProvider {
    private Integer id;
    private Contact provider;
    @JsonIgnore
    private Product product;
    private Date initialDate;
    private Date endDate;
    private Double price;
    private String currency;
    private Boolean status;
}
