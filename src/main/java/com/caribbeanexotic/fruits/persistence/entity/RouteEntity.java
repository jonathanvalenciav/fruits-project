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
    private Integer PIHeaderId;
    @Column(name = "Driver")
    private Integer driverId;

    @ManyToOne
    @JoinColumn(name = "Driver",insertable = false,updatable = false)
    private ContactEntity driver;
    @ManyToOne
    @JoinColumn(name = "PIHeader",insertable = false,updatable = false)
    private PIHeaderEntity PIHeader;
}
