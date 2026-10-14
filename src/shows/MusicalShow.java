package shows;

import persons.Actor;
import persons.Director;
import persons.MusicAuthor;

import java.util.ArrayList;

public class MusicalShow extends Show {

    private MusicAuthor musicAuthor;
    private String librettoText;

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

    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(MusicAuthor musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(this.librettoText);
    }
}
