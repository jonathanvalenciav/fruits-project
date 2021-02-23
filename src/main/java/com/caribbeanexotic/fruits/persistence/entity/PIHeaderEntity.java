package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "PIHeader")
public class PIHeaderEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "Date", nullable = false)
    private Date date;

    @Column(name = "JulianDay", nullable = false)
    private Integer julianDay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Farm", nullable = false)
    private FarmEntity farm;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PIHeader", nullable = false)
    private List<PIDetailEntity> PIDetails;

    @OneToMany(mappedBy = "PIHeaderRoute", cascade = CascadeType.DETACH)
    private List<RouteEntity> routes;
}

