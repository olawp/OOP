package no.hiof.olawp.oblig5.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Film is a class that represents a film
 * Holds information about a film, like title, runtime, description and releasedate
 *
 * @author Ola Wethal Petersen
 */


public class Film extends Production implements Comparable<Film> {


    private static ArrayList<Film> filmArray = new ArrayList<>();
    private String posterURL;

    /**
     *
     * @param title title of the film
     * @param runtime runtime of the film
     * @param description description of the film
     * @param releaseDate releasedate of the film
     */
    public Film(String title, int runtime, String description, LocalDate releaseDate) {
        super(title, runtime, description, releaseDate);
        filmArray.add(this);
    }

    /**
     *
     * @param title title of the film
     * @param runtime runtime of the film
     * @param description description of the film
     * @param releaseDate releasedate of the film
     * @param poster contains the url for the movies poster
     */

    public Film(String title, int runtime, String description, LocalDate releaseDate, String poster) {
        super(title, runtime, description, releaseDate);
        filmArray.add(this);
        this.posterURL = poster;
    }

    /**
     * Empty constructor
     */
    public Film (){

    }


    /**
     *
     * @param o represents a film
     * @return return either 1,0 or -1, determining how the array will be sorted.
     * Method used for sorting an array
     */
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

    /**
     *
     * @return returns a string representation of the object
     */
    @Override
    public String toString(){
        return super.getTitle();
    }

    // ************************ GETTERS AND SETTERS ************************

    public static ArrayList<Film> getFilmArray() {
        return filmArray;
    }

    public static void setFilmArray(ArrayList<Film> filmArray) {
        Film.filmArray = filmArray;
    }



    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }
}
