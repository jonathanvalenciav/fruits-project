package com.caribbeanexotic.fruits.persistence.entity.auth;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "UserApp")
public class UserEntity {
    @Id
    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Enabled")
    private Boolean enabled;

}
