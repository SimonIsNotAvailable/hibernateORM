package netologiya.hibernateorm.service;

import netologiya.hibernateorm.entity.Person;
import netologiya.hibernateorm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService{
    PersonRepository personRepository;
    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getPersonNamesByCity(String city) {
        return personRepository.getPersonByCity(city);
    }
}
