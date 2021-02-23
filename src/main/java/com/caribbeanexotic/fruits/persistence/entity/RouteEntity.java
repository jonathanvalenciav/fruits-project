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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PIHeader", nullable = false)
    private PIHeaderEntity PIHeaderRoute;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Driver", nullable = false)
    private ContactEntity driver;
}
