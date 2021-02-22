package com.caribbeanexotic.fruits.persistence;

import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.domain.dto.Role;

import java.util.List;
import java.util.Optional;

public interface IContactRepository {
    List<Contact> getAllContacts();
    Optional<Contact> getContactById(Integer id);
    Optional<Contact> getContactByIdentificationNumber(String identificationNumber);
    List<Contact> getAllContactsByRole(Role role);
}
