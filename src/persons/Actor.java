package persons;

import enums.Sex;

public class Actor extends Person {

    int height;

    public Actor(String name, String surname, Sex gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
