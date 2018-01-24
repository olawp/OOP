package no.hiof.olawp.oblig2;

public class Episode {
    private int episodeNumber;
    private int season;
    private String title;
    private int runtime;



    public Episode(int episodeNumber, int season, String title, int runtime) {
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.title = title;
        this.runtime = runtime;
    }

    public Episode(int episodeNumber, int season, String title) {
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.title = title;
    }


    @Override
    public String toString(){
        return "\n E" + episodeNumber + "S" + season + ". " + title + ".  Duration: " + runtime + " minutes. \n" ;
    }

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
}
