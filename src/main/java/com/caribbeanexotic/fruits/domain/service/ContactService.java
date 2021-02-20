package com.caribbeanexotic.fruits.domain.service;

import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.domain.dto.Farm;
import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.persistence.repository.implementation.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.getAllContacts();
    }

    public Optional<Contact> getContactById(Integer id) {
        return contactRepository.getContactById(id);
    }

    public Optional<Contact> getContactByIdentificationNumber(String identificationNumber){
        return contactRepository.getContactByIdentificationNumber(identificationNumber);
    }

    public List<Contact> getAllContactsByRole(Role role){
        return contactRepository.getAllContactsByRole(role);
    }
}
