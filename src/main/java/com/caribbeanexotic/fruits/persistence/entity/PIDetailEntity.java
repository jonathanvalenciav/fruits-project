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
    @Column(name = "PIHeader")
    private Integer PIHeaderId;
    @Column(name = "Product")
    private Integer productId;
    @Column(name = "Quality")
    private Integer qualityId;
    @Column(name = "UnitPrice")
    private Integer unitPriceId;
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

    @ManyToOne
    @JoinColumn(name = "PIHeader",insertable = false,updatable = false)
    private PIHeaderEntity PIHeader;
    @ManyToOne
    @JoinColumn(name = "Product",insertable = false,updatable = false)
    private ProductEntity product;
    @ManyToOne
    @JoinColumn(name = "Quality",insertable = false,updatable = false)
    private QualityEntity quality;
    @ManyToOne
    @JoinColumn(name = "UnitPrice",insertable = false,updatable = false)
    private PriceProductProviderEntity unitPrice;
}
