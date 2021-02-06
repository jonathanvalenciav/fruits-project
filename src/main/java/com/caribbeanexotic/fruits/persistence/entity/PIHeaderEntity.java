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
    @Column(name = "Farm")
    private Integer farmId;
    @ManyToOne
    @JoinColumn(name = "Farm",insertable = false,updatable = false)
    private FarmEntity farm;

    @OneToMany(mappedBy = "id",cascade = {CascadeType.ALL})
    private List<PIDetailEntity> piDetails;
}

