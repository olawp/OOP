package no.hiof.olawp.oblig3;

import java.util.Date;

public class Film extends Production {
    public Film(String title, int runtime, String description, Date releaseDate) {
        super(title, runtime, description, releaseDate);
    }

    @Override
    public String toString(){
        return super.getTitle() + " - Runtime: " + super.getRuntime() + " minutes. \n" + super.getDescription() + "\n" +
                "Release date: " +  super.getReleaseDate().getYear() + "\n" + "Director: " + super.getDirector().getName();

    }


}
