package netologiya.hibernateorm.service;

import netologiya.hibernateorm.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findPersonByAgeIsLessThan(int age);
    List<Person> findPersonByCity(String city);
    Optional<Person> findPersonByNameAndSurname(String name, String surname);
}
