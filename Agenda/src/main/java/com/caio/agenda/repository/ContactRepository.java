package com.caio.agenda.repository;

import com.caio.agenda.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
