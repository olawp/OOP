package no.hiof.olawp.studentregistrering;

import java.util.ArrayList;

public class Student {
    private String fornavn;
    private String etternavn;
    private int alder;
    private ArrayList<Kurs> kurs = new ArrayList<>();

    public Student(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public void leggTilKurs(Kurs kurs) {
        this.kurs.add(kurs);
    }

    public ArrayList<Kurs> getKurs() {
        return kurs;
    }
}
