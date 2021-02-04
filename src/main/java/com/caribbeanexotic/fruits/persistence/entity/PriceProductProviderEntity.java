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
    private Integer provider;
    @Column(name = "Product")
    private Integer product;
    @Column(name = "InitialDate")
    private Date initialDate;
    @Column(name = "EndDate")
    private Date endDate;
    @Column(name = "Price")
    private Double price;
    @Column(name = "Status")
    private Boolean status;
}
