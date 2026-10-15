package shows;

import persons.Actor;
import persons.Director;
import persons.MusicAuthor;

import java.util.ArrayList;

public class Opera extends MusicalShow {

    private final int choirSize;

    public Opera(String title,
                 Director director,
                 double duration,
                 ArrayList<Actor> listOfActors,
                 MusicAuthor musicAuthor,
                 String librettoText,
                 int choirSize) {
        super(title, director, duration, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
