package netologiya.hibernateorm.controller;

import netologiya.hibernateorm.entity.Person;
import netologiya.hibernateorm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    @ResponseBody
    public List<Person> getPersonsByCity(String city) {
        return personService.getPersonNamesByCity(city);
    }
}
