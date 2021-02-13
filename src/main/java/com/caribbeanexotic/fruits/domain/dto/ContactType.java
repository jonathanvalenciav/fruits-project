package com.caribbeanexotic.fruits.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContactType {
    private Integer id;
    private String code;
    private String description;
}
