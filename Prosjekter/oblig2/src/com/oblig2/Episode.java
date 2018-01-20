package com.oblig2;

public class Episode {
    private int episodenummer;
    private int sesong;
    private String tittel;
    private String spilletid;

    public Episode(int episodenummer, int sesong, String tittel, String spilletid) {
        this.episodenummer = episodenummer;
        this.sesong = sesong;
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    public int getEpisodenummer() {
        return episodenummer;
    }

    public void setEpisodenummer(int episodenummer) {
        this.episodenummer = episodenummer;
    }

    public int getSesong() {
        return sesong;
    }

    public void setSesong(int sesong) {
        this.sesong = sesong;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(String spilletid) {
        this.spilletid = spilletid;
    }
}

