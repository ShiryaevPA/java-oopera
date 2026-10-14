package shows;

import persons.Actor;

import java.util.ArrayList;

public class Show {

    String title;
    String director;
    int duration;
    ArrayList<Actor> listOfActors;

    public Show(String title, String director, int duration, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
    }

    void printListOfActors() {

    }

    void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    void replacementActor(Actor oldActor, Actor newActor) {

    }
}
