package no.hiof.olawp.oblig3;


public class Episode extends Production {
    private int episodeNumber;
    private int season;


    public Episode(int episodeNumber,int season, String title, int runtime) {
        super(title, runtime);
        this.episodeNumber = episodeNumber;
        this.season = season;
    }

    public Episode(String title, int episodeNumber, int season) {
        super(title);
        this.episodeNumber = episodeNumber;
        this.season = season;
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
