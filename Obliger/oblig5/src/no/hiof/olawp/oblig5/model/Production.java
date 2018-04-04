package no.hiof.olawp.oblig5.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Production is a class representing a production, in this case a film or a TvShow
 * Holds information like title, runtime, description, relasedate, director and a list of roles
 *
 * @author Ola Wethal Petersen
 */

public abstract class Production {

    private String title;
    private int runtime;
    private String description;
    private LocalDate releaseDate;
    private Person director;
    private ArrayList<Role> roleArray = new ArrayList<>();


    /**
     *
     * @param title title of the production
     * @param runtime runtime of the production
     * @param description description of the production
     * @param releaseDate releasedate of the production
     */
    public Production(String title, int runtime, String description, LocalDate releaseDate) {
        this.title = title;
        this.runtime = runtime;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    /**
     *
     * @param title title of the production
     * @param runtime runtime of the production
     * @param releaseDate releasedate of the production
     */

    public Production(String title, int runtime,LocalDate releaseDate) {
        this.title = title;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
    }

    /**
     *
     * @param title title of the production
     * @param runtime runtime of the production
     */

    public Production(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    /**
     *
     * @param title title of the production
     */

    public Production(String title) {
        this.title = title;
    }

    /**
     * Empty constructor
     */
    public Production(){

    }


    /**
     *
     * @param role parameter containing info about a role
     *
     * Method for adding a role to the role array
     */
    public void addARole(Role role){
        this.roleArray.add(role);
    }



    /**
     *
     * @param role parameter containing info about a role
     *
     * Method for adding multiple roles to the role array at the same time
     */
    public void addMultipleRoles(Role ... role){
        this.roleArray.addAll(Arrays.asList(role));
    }



    // ************************ GETTERS AND SETTERS ************************
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
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
