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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Provider", nullable = false)
    private ContactEntity provider;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Product", nullable = false)
    private ProductEntity product;

    @Column(name = "InitialDate", nullable = false)
    private Date initialDate;

    @Column(name = "EndDate")
    private Date endDate;

    @Column(name = "Price", length = 10, scale = 3, nullable = false)
    private Double price;

    @Column(name = "Currency", length = 4, nullable = false)
    private String currency;

    @Column(name = "Status", nullable = false)
    private Boolean status;
}
