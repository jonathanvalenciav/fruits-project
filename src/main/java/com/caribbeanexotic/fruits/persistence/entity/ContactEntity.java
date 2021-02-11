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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdentificationType")
    private IdentificationTypeEntity identificationType;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ContactType")
    private ContactTypeEntity contactType;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Role")
    private RoleEntity role;

    @Column(name = "Name")
    private String name;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "BusinessName")
    private String businessName;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "VehiclePlate")
    private String vehiclePlate;
}
