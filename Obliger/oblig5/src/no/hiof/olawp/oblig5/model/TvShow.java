package no.hiof.olawp.oblig5.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * TvShow is a class that represents a TvShow
 * Holds information about the TvShows title, description, relasedate, runtime, number of season and a list containing episodes
 *
 *@author Ola Wethal Petersen
 */
public class TvShow implements Comparable<TvShow>{
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodeList = new ArrayList<>();
    private float avgRuntime;
    private int numberOfSeasons;
    private static ArrayList<TvShow> tvShowArray = new ArrayList<>();

    /**
     * Constructor for creating a TvShow object
     * @param title title of the TvShow
     * @param description a description of the TvShow
     * @param releaseDate parameter containing the TvShows releasedate
     */
    public TvShow(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        tvShowArray.add(this);
    }


    /**
     * Updates the average runtime of the TvShow. Gets called on every time a new episode gets added to the show.
     */
    private void updateAverageRuntime(){
        float sum = 0;

        for (Episode i: episodeList) {
            sum += i.getRuntime();

        }

        avgRuntime = sum/episodeList.size();
    }




    /**
     *
     * @param season tells us the which season a episode is in
     *
     * Prints ut a list of episodes with a specific season
     */
    public void printSeason (int season){

        for (Episode e: episodeList){
            if(e.getSeason() == season){
                System.out.println(e);
            }
        }
    }



    /**
     *
     * @param episode parameter containing info about a certain episode
     *
     * Method for adding episodes to out arraylist. Checks if the episodes season does not equal the current seasons number + 2.
     * Updates the average runtime after checking the seasonnumber.
     */
    public void addEpisode(Episode episode){
        if(episode.getSeason()>numberOfSeasons + 1) {
            System.out.println("Cant add episode from this season. Add episode from an earlier season");
        }
        else {
            this.episodeList.add(episode);
            if (episode.getSeason() > numberOfSeasons) {
                numberOfSeasons = episode.getSeason();
            }
        }



        updateAverageRuntime();
    }

    //Oppretter et nytt array for å legge medlemmer av casten i. Bruker en for each løkke for å gå gjennom episodelisten til serien,
    // legger så til alle tingene som likker i RoleArray og legger de til i arrayet vi opprettet tidligere og returnerer det.

    /**
     *
     * @return returns a array containing the cast of a production
     * Method that creates an array with the members of a cast. Uses a for each to add all the castmembers to the array we created. Lastly returns the array.
     */
    public ArrayList getCast(){
        ArrayList<Role>CastArray = new ArrayList<>();
        for (Episode a:episodeList){
            CastArray.addAll(a.getRoleArray());
        }
        return CastArray;
    }


    /**
     *
     * @return returns a string representation of the object
     */
    @Override
    public String toString(){
        return title+ "  \n"  + description + " - Release date: " + releaseDate.getYear() + "\n";
    }


    /**
     *
     * @param o representation of a TvShow
     * @return return either 1,0 or -1, determining how the array will be sorted.
     * Method used for sorting an array
     */
    @Override
    public int compareTo(TvShow o) {
        int compare = this.getTitle().compareTo(o.getTitle());
        if (compare < 0) {
            return -1;
        }
        else if (compare > 0){
            return 1;
        }
        return 0;
    }

    // ************************ GETTERS AND SETTERS ************************
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public ArrayList<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(ArrayList<Episode> episodeList) {
        this.episodeList = episodeList;
    }

    public float getAvgRuntime() {
        return avgRuntime;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setAvgRuntime(float avgRuntime) {
        this.avgRuntime = avgRuntime;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public static ArrayList<TvShow> getTvShowArray() {
        return tvShowArray;
    }

    public static void setTvShowArray(ArrayList<TvShow> tvShowArray) {
        TvShow.tvShowArray = tvShowArray;
    }
}


