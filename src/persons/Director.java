package persons;

import enums.Sex;

public class Director extends Person {

    int numberOfShows;

    public Director(String name, String surname, Sex gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    void printDirectorInfo(Director director) {
        System.out.println(director);
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfShows=" + numberOfShows +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
