package no.hiof.olawp.flyprosjekt;

public class Fly {
    private String modell;
    private int passasjerer;
    private int seter;


    public Fly() {
        modell = "Ukjent";
        passasjerer = 0;
        seter = 150;
    }


    public Fly (String modell, int seter) {
        this.modell = modell;
        this.seter = seter;
        passasjerer = 0;
    }

    public void leggTilEnPassasjer(){
        if(seter > passasjerer)
            passasjerer++;

        else
            System.out.println("Flyet har ikke flere seter tilgjengelig");
    }

    public String getModell() {
        return modell;
    }

    public int getPassasjerer() {
        return passasjerer;
    }

    public int getSeter() {
        return seter;
    }

    @Override
    public String toString(){
        return "Fly av typen " + modell + " har plass til " + seter + " personer.";
    }

}