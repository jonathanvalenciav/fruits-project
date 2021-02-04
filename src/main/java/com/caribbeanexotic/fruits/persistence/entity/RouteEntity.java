package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Route")
public class RouteEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "PIHeader")
    private Integer aPIHeader;
    @Column(name = "Driver")
    private Integer driver;
}
