package com.caribbeanexotic.fruits.persistence.entity.auth;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "authorities")
public class AuthorityEntity {
    @Id
    private Integer userName;
    private String authority;
}
