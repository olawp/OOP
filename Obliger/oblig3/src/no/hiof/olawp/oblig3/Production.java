package no.hiof.olawp.oblig3;

import java.util.Date;

public class Production {
    private String title;
    private int runtime;
    private String description;
    private Date releaseDate;
    private Person director;

    public Production(String title, int runtime, String description, Date releaseDate) {
        this.title = title;
        this.runtime = runtime;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public Production(String title, int runtime,Date releaseDate) {
        this.title = title;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
    }

    public Production(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    public Production(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }
}
