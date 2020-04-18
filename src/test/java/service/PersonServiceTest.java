package service;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import entities.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PersonServiceTest {
  @Test
  public void groupByAge_returnbyGrouping() {
    Person person1 =
        Person.builder().setFirstName("Srinivas").setLastName("Penukonda").setAge(35).build();
    Person person2 =
        Person.builder().setFirstName("Abhinav").setLastName("Mathur").setAge(35).build();
    Person person3 = Person.builder().setFirstName("Jon").setLastName("Snow").setAge(25).build();
    PersonService personService = new PersonService();

    assertThat(personService.groupByAge(ImmutableSet.of(person1, person2, person3)))
        .containsExactlyEntriesIn(ImmutableSetMultimap.of(35, person1, 35, person2, 25, person3));
  }
}
