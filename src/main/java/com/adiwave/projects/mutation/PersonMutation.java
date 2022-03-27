package com.adiwave.projects.mutation;

import com.adiwave.projects.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMutation implements GraphQLMutationResolver {

    @Autowired
    private PersonService personService;

    public Integer createPerson(String name) {
        return this.personService.createPerson(name).getId();
    }
}
