package shows;

import persons.Actor;
import persons.Choreographer;
import persons.Director;
import persons.MusicAuthor;

import java.util.ArrayList;

public class Ballet extends MusicalShow {

    private Choreographer choreographer;

    public Ballet(String title,
                  Director director,
                  double duration,
                  ArrayList<Actor> listOfActors,
                  MusicAuthor musicAuthor,
                  String librettoText,
                  Choreographer choreographer) {
        super(title, director, duration, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Choreographer choreographer) {
        this.choreographer = choreographer;
    }
}
