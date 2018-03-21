package no.hiof.olawp.SuperhelterJson.model;

import java.io.Serializable;

public class Superhelt implements Serializable {
    private static final long serialVersionUID = 1337L;

    private String navn, alterEgo;

    public Superhelt(String navn, String alterEgo) {
        this.navn = navn;
        this.alterEgo = alterEgo;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    @Override
    public String toString() {
        return navn;
    }
}
