package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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
    @Column(name = "Farm")
    private Integer farm;
}
