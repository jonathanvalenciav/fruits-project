package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PIHeader {
    private Integer id;
    private Date date;
    private Integer julianDate;
    private Integer farm;
}
