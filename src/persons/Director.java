package persons;

import enums.Sex;

public class Director extends Person {

    private int numberOfShows;

    public Director(String name, String surname, Sex gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                super.toString() +
                "} ";
    }
}
