package com.softserve.academy.repository;

import com.softserve.academy.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private static List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    public void deletePerson(int id) {
        Person person = people.stream().filter((p) -> p.getId() == id).findFirst().orElse(null);

        if (person != null) {
            people.remove(person);
        }
    }

    public List<Person> getAllPeople() {
        return people;
    }
}
