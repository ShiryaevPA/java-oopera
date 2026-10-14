package persons;

import enums.Sex;

public class Person {

    String name;
    String surname;
    Sex gender;

    public Person(String name, String surname, Sex gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
