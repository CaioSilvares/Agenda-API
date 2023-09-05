package com.caio.agenda.controller;

import com.caio.agenda.model.Contact;
import com.caio.agenda.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO: example
@RestController
@RequestMapping("api/contacts") //value = api/contacts
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

    @GetMapping("all") //mirar na rota api/contacts/all
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }
}
