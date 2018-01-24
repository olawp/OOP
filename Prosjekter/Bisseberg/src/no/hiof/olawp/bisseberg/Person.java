package no.hiof.olawp.bisseberg;

public class Person {
    private String fpNr;
    private String fNavn;
    private String eNavn;

    public Person(String fNavn, String eNavn) {
        this.fNavn = fNavn;
        this.eNavn = eNavn;
    }

    public String getfNavn() {
        return fNavn;
    }

    public void setfNavn(String fNavn) {
        this.fNavn = fNavn;
    }

    public String geteNavn() {
        return eNavn;
    }

    public void seteNavn(String eNavn) {
        this.eNavn = eNavn;
    }
}
