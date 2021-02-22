package com.caribbeanexotic.fruits.persistence.repository.implementation;

import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.persistence.IContactRepository;
import com.caribbeanexotic.fruits.persistence.entity.ContactEntity;
import com.caribbeanexotic.fruits.persistence.mapper.ContactMapper;
import com.caribbeanexotic.fruits.persistence.mapper.RoleMapper;
import com.caribbeanexotic.fruits.persistence.repository.ContactCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContactRepository implements IContactRepository {
    @Autowired
    ContactCrudRepository contactCrudRepository;

    @Autowired
    ContactMapper contactMapper;

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Contact> getAllContacts() {
        return contactMapper.toContacts((List<ContactEntity>)contactCrudRepository.findAll());
    }

    @Override
    public Optional<Contact> getContactById(Integer id) {
        return contactCrudRepository.findById(id).map(contact -> contactMapper.toContact(contact));
    }

    @Override
    public Optional<Contact> getContactByIdentificationNumber(String identificationNumber) {
        return contactCrudRepository.findContactByIdentificationNumber(identificationNumber).map(contact -> contactMapper.toContact(contact));
    }

    @Override
    public List<Contact> getAllContactsByRole(Role role) {
        return contactMapper.toContacts((List<ContactEntity>)contactCrudRepository.findAllByRole(roleMapper.toRolEntity(role)));
    }
}
