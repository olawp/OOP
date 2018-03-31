package no.hiof.olawp.Dyreparkdatabase;

import java.time.LocalDate;

public class Dyr {
    private int id;
    private String navn,art;
    private LocalDate fodeselsdato;

    public Dyr(int id, String navn, String art, LocalDate fodeselsdato) {
        this.id = id;
        this.navn = navn;
        this.art = art;
        this.fodeselsdato = fodeselsdato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public LocalDate getFodeselsdato() {
        return fodeselsdato;
    }

    public void setFodeselsdato(LocalDate fodeselsdato) {
        this.fodeselsdato = fodeselsdato;
    }
}
