package no.hiof.olawp.DyreparkJavaFX.model;

import java.time.LocalDate;

public class Dyr {
    private String navn, art;
    private int id;
    private LocalDate fodselsdato;

    public Dyr(String navn, String art, int id, LocalDate fodselsdato) {
        this.navn = navn;
        this.art = art;
        this.id = id;
        this.fodselsdato = fodselsdato;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFodselsdato() {
        return fodselsdato;
    }

    public void setFodselsdato(LocalDate fodselsdato) {
        this.fodselsdato = fodselsdato;
    }


}
