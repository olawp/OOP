package no.hiof.olawp.oblig4;

import java.util.ArrayList;
import java.util.Date;



public class Film extends Production implements Comparable {

    private static ArrayList<Film> filmArray = new ArrayList<>();

    public Film(String title, int runtime, String description, Date releaseDate) {
        super(title, runtime, description, releaseDate);
        filmArray.add(this);
    }

    @Override
    public String toString(){
        return super.getTitle() + " - Runtime: " + super.getRuntime() + " minutes.";

    }

    public static ArrayList<Film> getFilmArray() {
        return filmArray;
    }

    public static void setFilmArray(ArrayList<Film> filmArray) {
        Film.filmArray = filmArray;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
