package netologiya.hibernateorm.controller;

import netologiya.hibernateorm.entity.Person;
import netologiya.hibernateorm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    @ResponseBody
    public List<Person> getPersonsbyCity(@RequestParam String city) {
        return personService.findPersonByCity(city);
    }

    @GetMapping("/by-age-less-that")
    @ResponseBody
    public List<Person> getPersonsWithAgeLessThat(@RequestParam int age) {
        return personService.findPersonByAgeIsLessThan(age);
    }

    @GetMapping("/by-name-and-surname")
    @ResponseBody
    public Optional<Person> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personService.findPersonByNameAndSurname(name,surname);
    }
}
