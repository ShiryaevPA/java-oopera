package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {

    private String title;
    private Director director;
    private double duration;
    private final ArrayList<Actor> listOfActors;

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

    public void printListOfActors() {
        System.out.println("В спектакле '" + this.title + "' участвуют актёры:\nАплодисменты пожалуйста!!!");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void printDirector() {
        System.out.println("Встречайте режиссёра спектакля '" + this.title + "':\n" + this.director + "\n");
    }

    public void addActor(Actor actor) {
        boolean isOnList = false;
        for (Actor actorInList : listOfActors) {
            if (actor.equals(actorInList)) {
                isOnList = true;
                break;
            }
        }
        if (!isOnList) {
            listOfActors.add(actor);
            System.out.println("Актёр '" + actor.getName() + "' добавлен в спектакль '" + this.title + "'\n");
        } else {
            System.out.println("Актёр '" + actor.getName() + "' в этом спектакле '" + this.title + "' уже участвует\n");
        }
    }

    public void replacementActor(Actor newActor, String surname) {
        int count = 0;
        int index = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (surname.equals(listOfActors.get(i).getSurname())) {
                count++;
                index = i;
            }
            if(count > 1) {
                break;
            }
        }

        if (count == 0) {
            System.out.println("Актёр с фамилией '" + surname + "' в этом спектакле '" + this.title + "' не участвует\n");
        } else if (count == 1) {
            listOfActors.set(index, newActor);
            System.out.println("Актёр '" + newActor.getName() + "' сменил актёра '" + surname + "' в спектакле '" + this.title + "'\n");
        } else {
            System.out.println("С фамилией '" + surname + "' в спектакле участвуют несколько актёров, замена по фамилии не возможна\n");
        }
    }
}