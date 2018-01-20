package com.oblig2;

import java.util.ArrayList;

public class TVshow {
    private String tittel;
    private String beskrivelse;
    private String utgivelsesdato;

    public TVshow(String tittel, String beskrivelse, String utgivelsesdato) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public void setUtgivelsesdato(String utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }
}
