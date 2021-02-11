package com.caribbeanexotic.fruits.persistence.entity;

import com.caribbeanexotic.fruits.domain.dto.City;
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

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Country")
    private CountryEntity country;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    private List<CityEntity> cities;
}
