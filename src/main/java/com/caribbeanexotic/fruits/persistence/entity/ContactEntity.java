package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Contact")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "IdentificationNumber")
    private String identificationNumber;
    @Column(name = "IdentificationType")
    private Integer identificationType;
    @Column(name = "ContactType")
    private Integer contactType;
    @Column(name = "Role")
    private Integer role;
    @Column(name = "Name")
    private String name;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "BusinessName")
    private String businessName;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "emailAddress")
    private String emailAddress;
    @Column(name = "VehiclePlate")
    private String vehiclePlat;
}
