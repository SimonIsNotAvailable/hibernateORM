package netologiya.hibernateorm.service;

import jakarta.transaction.Transactional;
import netologiya.hibernateorm.entity.Person;
import netologiya.hibernateorm.repositories.CustomizedPersonCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{
    CustomizedPersonCrudRepository personCrudRepository;
    @Autowired
    public PersonServiceImpl(CustomizedPersonCrudRepository personCrudRepository) {
        this.personCrudRepository=personCrudRepository;
    }


    public List<Person> findPersonByAgeIsLessThan(int age){
        return personCrudRepository.findPersonByAgeIsLessThanOrderByAgeAsc(age);
    }
    public List<Person> findPersonByCity(String city){
        return personCrudRepository.findPersonByCity(city);
    }

    @Override
    public Optional<Person> findPersonByNameAndSurname(String name, String surname) {
        return personCrudRepository.findPersonByNameAndSurname(name, surname);
    }
}
