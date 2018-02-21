package no.hiof.olawp.oblig4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public abstract class Production {
    private String title;
    private int runtime;
    private String description;
    private Date releaseDate;
    private Person director;
    private ArrayList<Role> roleArray = new ArrayList<>();

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

    //Meotde for å legge til en rolle
    public void addARole(Role role){
        this.roleArray.add(role);
    }

    //En annen måte å gjøre dette på er å lage et array som du putter role objektene i. I addMultipleRoles metoden
    //flytter du elementee fra dette arrayet over til Rolearray.
    //Jeg valgte denne metoden siden jeg syntes det var en mer fornuftig og praktisk måte å gjøre det på.
    public void addMultipleRoles(Role ... role){
        this.roleArray.addAll(Arrays.asList(role));
    }



    //Gettere og settere
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

    public ArrayList<Role> getRoleArray() {
        return roleArray;
    }
}
