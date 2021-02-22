package com.caribbeanexotic.fruits.persistence.mapper;

import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.persistence.entity.ContactEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    Contact toContact(ContactEntity contact);
    List<Contact> toContacts(List<ContactEntity> contacts);

    ContactEntity toContactEntity(Contact contact);
    List<ContactEntity> toContactEntity(List<Contact> contacts);
}
