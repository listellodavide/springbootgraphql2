package com.adiwave.projects.query;


import com.adiwave.projects.dao.entity.Person;
import com.adiwave.projects.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PersonQuery implements GraphQLQueryResolver {

    @Autowired
    private PersonService personService;

    public Optional<Person> getPerson(final int id) {
        return this.personService.getPerson(id);
    }
}
