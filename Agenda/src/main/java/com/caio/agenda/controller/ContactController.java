package com.caio.agenda.controller;

import com.caio.agenda.model.Contact;
import com.caio.agenda.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO: example
@RestController
@RequestMapping("contacts") //value = contacts
public class ContactController {
    private ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PostMapping
    public Contact register(@RequestBody Contact contact){
        var savedContact = contactRepository.save(contact);
        return savedContact;
    }

    @GetMapping
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable Long id) {
        var searchById = contactRepository.findById(id);

        if(searchById.isEmpty()) {
            return null;
        }

        var contact = searchById.get();
        return contact;
    }

}
