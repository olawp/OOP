package no.hiof.olawp.oblig4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;


public class Film extends Production implements Comparable<Film> {

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
    public int compareTo(Film o) { int compare = this.getTitle().compareTo(o.getTitle());
        if (compare < 0) {
            return -1;
        }
        else if (compare > 0){
            return 1;
        }
        return 0;
    }
}
