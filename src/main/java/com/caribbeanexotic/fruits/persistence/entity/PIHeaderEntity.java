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

    @Column(name = "Date")
    private Date date;

    @Column(name = "JulianDate")
    private Integer julianDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Farm")
    private FarmEntity farm;

    @OneToMany(mappedBy = "PIHeader", cascade = CascadeType.ALL)
    private List<PIDetailEntity> PIDetails;

    @OneToMany(mappedBy = "PIHeader", cascade = CascadeType.ALL)
    private List<RouteEntity> routes;
}

