package no.hiof.olawp.AnonymKlasse;

public class SafariDyr implements Comparable<SafariDyr> {
    private String navn, art;
    private int alder;

    public SafariDyr(String navn, String art, int alder) {
        this.navn = navn;
        this.art = art;
        this.alder = alder;
    }



    @Override
    public int compareTo(SafariDyr sammenligningsDyr) {
        return this.navn.compareTo(sammenligningsDyr.getNavn());
    }

    @Override
    public String toString() {
        return navn + " - " + art + " - " + alder;
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

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }


}
