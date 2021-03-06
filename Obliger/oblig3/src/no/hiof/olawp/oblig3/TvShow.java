package no.hiof.olawp.oblig3;

import java.lang.reflect.Array;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Date;


public class TvShow{
    private String title;
    private String description;
    private Date releaseDate;
    private ArrayList<Episode> episodeList = new ArrayList<>();
    private float avgRuntime;
    private int numberOfSeasons;

    //Konstruktør
    public TvShow(String title, String description, Date releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    //Oppgave 5
    //Metode som oppdaterer den gjennomsnittlige spilletiden, blir kalt på i addepisode metoden hver gang en episoden blir lagt til.
    private void updateAverageRuntime(){
        float sum = 0;

        for (Episode i: episodeList) {
            sum += i.getRuntime();

        }

        avgRuntime = sum/episodeList.size();
    }


    //Oppgave 4
    //Printer ut alle episodene i en sesong
    public void printSeason (int season){

        for (Episode e: episodeList){
            if(e.getSeason() == season){
                System.out.println(e);
            }
        }
    }



    //Oppgave 1, 7 og 8
    //Metode som sjekker at sesongnummeret ikke er høyere enn current sesong + 1. Legger så til episoden og oppdaterer spilletiden.
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
    public ArrayList getCast(){
        ArrayList<Role>CastArray = new ArrayList<>();
    for (Episode a:episodeList){
        CastArray.addAll(a.getRoleArray());
        }
        return CastArray;
    }



    //Oppgave 3
    //toString metoder
    @Override
    public String toString(){
        return title+ "  \n"  + description + " - Release date: " + releaseDate.getYear() + "\n" + episodeList;
    }




    //Settere og gettere
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
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
}


