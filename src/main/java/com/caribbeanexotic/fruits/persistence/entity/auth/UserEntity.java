package com.caribbeanexotic.fruits.persistence.entity.auth;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "User")
public class UserEntity {
    @Id
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "Enabled")
    private Boolean enabled;

}
