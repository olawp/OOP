package no.hiof.olawp.IndreKlasseEksempel;

import java.util.ArrayList;
import java.util.List;

public class Ansatt {
    private String navn;
    private int ansatttummer;

    private List<Lonnsslipp> lonnsslippArrayList = new ArrayList<>();


    public Ansatt(String navn, int ansatttummer) {
        this.navn = navn;
        this.ansatttummer = ansatttummer;
    }

    public void lonnForMaaned(String dato, double bruttoLonn, int skatteProsent){
        lonnsslippArrayList.add(new Lonnsslipp(dato,bruttoLonn,skatteProsent));
    }

    public void skrivUtLonnsslipper(){
        for (Lonnsslipp maanedsLonn : lonnsslippArrayList)
        {
            System.out.println(maanedsLonn);
        }
    }





    private class Lonnsslipp{
        private String dato;
        private double bruttoLonn;
        private double nettoLonn;
        private int skatteProsent;

        public Lonnsslipp(String dato, double bruttoLonn, int skatteProsent) {
            this.dato = dato;
            this.bruttoLonn = bruttoLonn;
            this.skatteProsent = skatteProsent;
            this.nettoLonn = bruttoLonn - ((bruttoLonn/100)*skatteProsent);
        }

        @Override
        public String toString() {
            return navn + " - Lønn for " + dato
                    + "\t Netto: " + nettoLonn;
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAnsatttummer() {
        return ansatttummer;
    }

    public void setAnsatttummer(int ansatttummer) {
        this.ansatttummer = ansatttummer;
    }

}
