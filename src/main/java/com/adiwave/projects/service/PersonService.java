package com.adiwave.projects.service;

import com.adiwave.projects.dao.entity.Person;
import com.adiwave.projects.dao.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> getPerson(final int id) {
        return this.personRepository.findById(id);
    }

    public Person createPerson(final String name) {
        Person p = new Person();
        p.setName(name);
        return this.personRepository.save(p);
    }
}
