package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "City")
public class CityEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "State")
    private String stateId;
    @ManyToOne
    @JoinColumn(name = "state",insertable = false,updatable = false)
    private StateEntity state;

}
