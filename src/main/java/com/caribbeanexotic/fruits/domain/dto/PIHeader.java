package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PIHeader {
    private Integer id;
    private Date date;
    private Integer julianDay;
    private Farm farm;
    private List<PIDetail> PIDetails;
    private List<Route> routes;
}
