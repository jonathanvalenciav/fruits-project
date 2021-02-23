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

    @Column(name = "IdentificationNumber", length = 20, nullable = false)
    private String identificationNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdentificationType", nullable = false)
    private IdentificationTypeEntity identificationType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ContactType", nullable = false)
    private ContactTypeEntity contactType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Role", nullable = false)
    private RoleEntity role;

    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "LastName", length = 50)
    private String lastName;

    @Column(name = "BusinessName", length = 150)
    private String businessName;

    @Column(name = "PhoneNumber", length = 15, nullable = false)
    private String phoneNumber;

    @Column(name = "EmailAddress", length = 70)
    private String emailAddress;

    @Column(name = "VehiclePlate")
    private String vehiclePlate;
}
