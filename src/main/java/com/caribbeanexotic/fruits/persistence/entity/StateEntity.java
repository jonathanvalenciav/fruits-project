package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "State")
public class StateEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "Code", length = 8, nullable = false)
    private String code;

    @Column(name = "Name", length = 40, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Country", nullable = false)
    private CountryEntity country;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    private List<CityEntity> cities;
}
