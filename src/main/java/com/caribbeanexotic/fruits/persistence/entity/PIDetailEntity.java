package com.caribbeanexotic.fruits.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PIDetail")
public class PIDetailEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "PIHeader")
    private PIHeaderEntity PIHeaderDetail;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Product")
    private ProductEntity product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Quality")
    private QualityEntity quality;

    @ManyToOne(fetch = FetchType.EAGER)
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
