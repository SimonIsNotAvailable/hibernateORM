package netologiya.hibernateorm.repositories;

import netologiya.hibernateorm.entity.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> getPersonByCity(String city);
}
