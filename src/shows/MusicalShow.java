package shows;

import persons.Actor;
import persons.Director;
import persons.MusicAuthor;

import java.util.ArrayList;

public class MusicalShow extends Show {

    private final MusicAuthor musicAuthor;
    private final String librettoText;

    public MusicalShow(String title,
                       Director director,
                       double duration,
                       ArrayList<Actor> listOfActors,
                       MusicAuthor musicAuthor,
                       String librettoText) {
        super(title, director, duration, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Для спектакля '" + getTitle() + "' можете ознакомиться с либретто:\n" + this.librettoText + "\n");
    }
}
