package com.caribbeanexotic.fruits.persistence.entity.auth;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Authority")
public class AuthorityEntity {
    @Id
    private Integer username;
    private String authority;
}
