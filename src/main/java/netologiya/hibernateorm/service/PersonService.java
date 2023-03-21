package netologiya.hibernateorm.service;

import netologiya.hibernateorm.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person>  getPersonNamesByCity(String city);
}
