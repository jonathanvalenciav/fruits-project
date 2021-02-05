package com.caribbeanexotic.fruits.domain.dto.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserApp {
    private String userName;
    private String password;
    private Boolean enabled;

}
