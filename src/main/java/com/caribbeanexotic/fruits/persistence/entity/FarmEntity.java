package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Farm")
public class FarmEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "City")
    private CityEntity city;

    @Column(name = "ICACertificate")
    private String ICACertificate;

    @Column(name = "GlobalGAPCertificate")
    private String globalGAPCertificate;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "Provider")
    private ContactEntity provider;
}
