package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "PIHeader")
public class PIHeaderEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @Column(name = "Date")
    private Date date;

    @Column(name = "JulianDay")
    private Integer julianDay;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "Farm")
    private FarmEntity farm;

    @OneToMany(mappedBy = "PIHeaderDetail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PIDetailEntity> PIDetails;

    @OneToMany(mappedBy = "PIHeaderRoute", cascade = CascadeType.DETACH)
    private List<RouteEntity> routes;
}

