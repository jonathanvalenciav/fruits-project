package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PIDetail")
public class PIDetailEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PIHeader")
    private PIHeaderEntity PIHeader;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Product")
    private ProductEntity product;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Quality")
    private QualityEntity quality;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "UnitPrice")
    private PriceProductProviderEntity unitPrice;

    @Column(name = "Lot")
    private Integer lot;

    @Column(name = "GrossWeight")
    private Double grossWeight;

    @Column(name = "NetWeight")
    private Double netWeight;

    @Column(name = "PackagingWeight")
    private Double packagingWeight;

    @Column(name = "PackagingAmount")
    private Double packagingAmount;

    @Column(name = "DehydratedWeight")
    private Double dehydratedWeight;

    @Column(name = "TotalPrice")
    private Double totalPrice;
}
