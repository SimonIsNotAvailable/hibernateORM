package netologiya.hibernateorm.repositories;

import netologiya.hibernateorm.entity.Person;
import netologiya.hibernateorm.entity.PersonPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomizedPersonCrudRepository extends JpaRepository<Person, PersonPK> {
    List<Person> findPersonByCity(String city);
    List<Person> findPersonByAgeIsLessThanOrderByAgeAsc(int age);
    Optional<Person> findPersonByNameAndSurname(String name, String surname);

}
