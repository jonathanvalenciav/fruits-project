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
    @Column(name = "Provider")
    private Integer providerId;
    @Column(name = "Product")
    private Integer productId;
    @Column(name = "InitialDate")
    private Date initialDate;
    @Column(name = "EndDate")
    private Date endDate;
    @Column(name = "Price")
    private Double price;
    @Column(name = "Status")
    private Boolean status;
    @Column(name = "Currency")
    private Boolean currency;

    @ManyToOne
    @JoinColumn(name = "Provider",insertable = false,updatable = false)
    private ContactEntity provider;
    @ManyToOne
    @JoinColumn(name = "Product",insertable = false,updatable = false)
    private ProductEntity product;
}
