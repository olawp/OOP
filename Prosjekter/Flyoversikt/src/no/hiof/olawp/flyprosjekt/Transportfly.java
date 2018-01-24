package no.hiof.olawp.flyprosjekt;

public class Transportfly extends Fly {
    private double maksLast;
    private double bruktLast;

    public Transportfly(double maksLast) {
        this.maksLast = maksLast;
    }

    public Transportfly(double maksLast, String modell, int seter){
        super(modell, seter);
        this.maksLast = maksLast;
    }

    public double getMaksLast() {
        return maksLast;
    }

    public double getBruktLast() {
        return bruktLast;
    }

    public void leggTilEnPakke(double hoyde, double bredde, double dybde){
        bruktLast += hoyde * bredde * dybde;
    }

    @Override
    public String toString(){
        return "Transportfly av typen " + getModell() + " har kapasitet " + maksLast;
    }

}
