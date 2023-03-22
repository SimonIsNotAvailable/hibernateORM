package netologiya.hibernateorm.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import netologiya.hibernateorm.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;
    private String query = "select p from Person p where p.city= :city";
//     @Autowired
//     public PersonRepositoryImpl() {
//     }

    @Override
    public List<Person> getPersonByCity(String city) {
        return entityManager.createQuery(query,  Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
