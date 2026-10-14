package shows;

import persons.Actor;

import java.util.ArrayList;

public class Ballet extends MusicalShow {

    String choreographer;


    public Ballet(String title,
                  String director,
                  int duration,
                  ArrayList<Actor> listOfActors,
                  String musicAuthor,
                  String librettoText,
                  String choreographer) {
        super(title, director, duration, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
