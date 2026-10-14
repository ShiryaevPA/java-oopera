package shows;

import persons.Actor;

import java.util.ArrayList;

public class MusicalShow extends Show {

    String musicAuthor;
    String librettoText;

    public MusicalShow(String title,
                       String director,
                       int duration,
                       ArrayList<Actor> listOfActors,
                       String musicAuthor,
                       String librettoText) {
        super(title, director, duration, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibrettoText() {

    }
}
