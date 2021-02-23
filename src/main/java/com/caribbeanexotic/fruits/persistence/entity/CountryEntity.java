package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "Code", length = 8, nullable = false)
    private String code;

    @Column(name = "Name", length = 40, nullable = false)
    private String name;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<StateEntity> states;
}
