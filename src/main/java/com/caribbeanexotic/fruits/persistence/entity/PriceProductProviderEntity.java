package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "PriceProductProvider")
public class PriceProductProviderEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "Provider")
    private ContactEntity provider;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "Product")
    private ProductEntity product;

    @Column(name = "InitialDate")
    private Date initialDate;

    @Column(name = "EndDate")
    private Date endDate;

    @Column(name = "Price")
    private Double price;

    @Column(name = "Currency")
    private String currency;

    @Column(name = "Status")
    private Boolean status;
}
