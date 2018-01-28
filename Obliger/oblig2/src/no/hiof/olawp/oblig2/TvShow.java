package no.hiof.olawp.oblig2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class TvShow{
    private String title;
    private String description;
    private Date releaseDate;
    private ArrayList<Episode> episodeList = new ArrayList<>();
    private float avgRuntime;
    private int numberOfSeasons = 5;


    public TvShow(String title, String description, Date releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }


    private void updateAverageRuntime(){
        float sum = 0;

        for (Episode i: episodeList) {
            sum += i.getRuntime();

        }

        avgRuntime = sum/episodeList.size();
    }

    public void printSeason (int season){

        for (Episode e: episodeList){
            if(e.getSeason() == season){
                System.out.println(e);
            }
        }
    }

    @Override
    public String toString(){
        return title+ "  \n"  + description + " Release date: " + releaseDate.getYear() + "\n" + episodeList;
    }

    public void addEpisode(Episode episodeList){
        this.episodeList.add(episodeList);
        updateAverageRuntime();

    }





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


