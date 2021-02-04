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
    private Integer piHeader;
    @Column(name = "Product")
    private Integer product;
    @Column(name = "Quality")
    private Integer quality;
    @Column(name = "UnitPrice")
    private Integer unitPrice;
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
