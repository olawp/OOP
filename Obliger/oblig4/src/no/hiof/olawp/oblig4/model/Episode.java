package no.hiof.olawp.oblig4.model;


import java.time.LocalDate;
import java.util.Date;

public class Episode extends Production implements Comparable<Episode> {
    private int episodeNumber;
    private int season;


    public Episode(int episodeNumber,int season,String title, int runtime, LocalDate releaseDate) {
        super(title,runtime, releaseDate);
        this.episodeNumber = episodeNumber;
        this.season = season;
    }

    public Episode(int episodeNumber,int season,String title, int runtime){
        super(title,runtime);
        this.season = season;
        this.episodeNumber = episodeNumber;
    }

    public Episode(int episodeNumber, int season, String title) {
        super(title);
        this.episodeNumber = episodeNumber;
        this.season = season;
    }


    @Override
    public int compareTo(Episode o) {
        if (this.season < o.season){
            return -1;
        }
        else if (this.season >o.season){
            return 1;
        }
        else if (this.getEpisodeNumber() < o.episodeNumber){
            return -1;
        }
        else if (this.getEpisodeNumber() < o.episodeNumber){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return ("\n E" + episodeNumber + "S" + season + ". " + super.getTitle() + ".  Duration: " + super.getRuntime() + " minutes. \n");
    }

    //Getter og settere
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

}
