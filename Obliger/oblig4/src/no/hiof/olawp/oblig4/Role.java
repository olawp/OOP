package no.hiof.olawp.oblig4;


public class Role {
    private String charFirstName;
    private String charLastName;
    private Person actor;

    public Role(String charFirstName, String charLastName, Person actor) {
        this.charFirstName = charFirstName;
        this.charLastName = charLastName;
        this.actor = actor;
    }

    //toString metode
    @Override
    public String toString() {
        return "\nCharacter: " + charFirstName + " " + charLastName + ". Actor: " + actor + "\n";
    }

    //Gettere og settere
    public String getCharFirstName() {
        return charFirstName;
    }

    public void setCharFirstName(String charFirstName) {
        this.charFirstName = charFirstName;
    }

    public String getCharLastName() {
        return charLastName;
    }

    public void setCharLastName(String charLastName) {
        this.charLastName = charLastName;
    }

    public Person getActor() {
        return actor;
    }

    public void setActor(Person actor) {
        this.actor = actor;
    }
}
