package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "PriceProductProvider")
public class PriceProductProviderEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Provider")
    private ContactEntity provider;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Product")
    private ProductEntity product;

    @Column(name = "InitialDate")
    private Date initialDate;

    @Column(name = "EndDate")
    private Date endDate;

    @Column(name = "Price")
    private Double price;

    @Column(name = "Currency")
    private Boolean currency;

    @Column(name = "Status")
    private Boolean status;
}
