package netologiya.hibernateorm.entity;
import java.io.Serializable;

public class PersonPK implements Serializable {
    
    // need to override equals and hashcode!
    
    private String name;
    
    private String surname;
    
    private int age;
    
    public PersonPK(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    public PersonPK() {
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
     public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  }
