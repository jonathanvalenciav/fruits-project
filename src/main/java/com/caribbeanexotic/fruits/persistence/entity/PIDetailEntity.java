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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Product", nullable = false)
    private ProductEntity product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Quality", nullable = false)
    private QualityEntity quality;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UnitPrice", nullable = false)
    private PriceProductProviderEntity unitPrice;

    @Column(name = "Lot", nullable = false)
    private Integer lot;

    @Column(name = "GrossWeight", length = 5, nullable = false)
    private Double grossWeight;

    @Column(name = "NetWeight", length = 5, nullable = false)
    private Double netWeight;

    @Column(name = "PackagingWeight", length = 5, nullable = false)
    private Double packagingWeight;

    @Column(name = "PackagingAmount", length = 5, nullable = false)
    private Double packagingAmount;

    @Column(name = "DehydratedWeight", length = 5, nullable = false)
    private Double dehydratedWeight;

    @Column(name = "TotalPrice", length = 20, scale = 3, nullable = false)
    private Double totalPrice;
}
