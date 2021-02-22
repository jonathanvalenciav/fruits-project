package com.caribbeanexotic.fruits.web.controller;

import com.caribbeanexotic.fruits.domain.dto.Contact;
import com.caribbeanexotic.fruits.domain.dto.Role;
import com.caribbeanexotic.fruits.domain.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Contact>> getAll() {
        return new ResponseEntity<>(contactService.getAllContacts(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Contact> getById(@PathVariable("id") Integer id) {
        return contactService.getContactById(id)
                .map(contact -> new ResponseEntity<>(contact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getByIdentificationNumber/{identificationNumber}")
    public ResponseEntity<Contact> getByIdentificationNumber(@PathVariable("identificationNumber") String identificationNumber) {
        return contactService.getContactByIdentificationNumber(identificationNumber)
                .map(contact -> new ResponseEntity<>(contact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAllByRole")
    public ResponseEntity<List<Contact>> getAllByRole(@RequestBody Role role) {
        return new ResponseEntity<>(contactService.getAllContactsByRole(role), HttpStatus.OK);
    }
}
