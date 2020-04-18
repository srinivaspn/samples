package service;

import com.google.common.collect.ImmutableSetMultimap;
import entities.Person;

import java.util.Collection;

public class PersonService {

  PersonService() {}

  ImmutableSetMultimap<Integer, Person> groupByAge(Collection<Person> persons) {
    final ImmutableSetMultimap.Builder<Integer, Person> personsByAge =
        ImmutableSetMultimap.builder();
    persons.forEach(person -> personsByAge.put(person.age(), person));
    return personsByAge.build();
  }
}
