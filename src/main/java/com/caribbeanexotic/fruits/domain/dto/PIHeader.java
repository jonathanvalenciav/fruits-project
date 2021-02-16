package com.caribbeanexotic.fruits.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PIHeader {
    private Integer id;
    private Date date;
    private Integer julianDay;
    private Farm farm;
    private List<PIDetail> PIDetails;
    private List<Route> routes;
}
