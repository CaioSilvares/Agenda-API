package com.caio.agenda.controller;

import com.caio.agenda.model.Phone;
import com.caio.agenda.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("phones")
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    @GetMapping
    public List<Phone> getAll() {
        return phoneRepository.findAll();
    }
}
