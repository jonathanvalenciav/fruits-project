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
    private Integer identificationTypeId;
    @Column(name = "ContactType")
    private Integer contactTypeId;
    @Column(name = "Role")
    private Integer roleId;
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
    @ManyToOne
    @JoinColumn(name = "IdentificationType",insertable = false,updatable = false)
    private IdentificationTypeEntity IdentificationType;
    @ManyToOne
    @JoinColumn(name = "ContactType",insertable = false,updatable = false)
    private ContactTypeEntity contactType;
    @ManyToOne
    @JoinColumn(name = "Role",insertable = false,updatable = false)
    private RoleEntity role;


}
