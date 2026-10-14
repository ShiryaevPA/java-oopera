package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {

    private String title;
    private Director director;
    private double duration;
    private ArrayList<Actor> listOfActors;

    public Show(String title, Director director, double duration, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }


    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        boolean isOnList = false;
        for(Actor actorInList : listOfActors) {
            if(actor.equals(actorInList)) {
                isOnList = true;
                break;
            }
        }
        if (!isOnList) {
            listOfActors.add(actor);
        } else {
            System.out.println("Актёр '" + actor.getName() + "' в этом спектакле '" + this.title  + "' уже участвует");
        }
    }

    public void replacementActor(Actor newActor, String surname) {
        boolean isOnList = false;
        for(int i = 0; i < listOfActors.size(); i++) {
            if(surname.equals(listOfActors.get(i).getSurname())) {
                listOfActors.set(i, newActor);
                isOnList = true;
                break;
            }
        }
        if (!isOnList) {
            System.out.println("Актёр с фамилией '" + surname + "' в этом спектакле '" + this.title + "' не участвует");
        }
    }
}
