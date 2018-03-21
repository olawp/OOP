package no.hiof.olawp.IndreKlasseEksempel;

public class Main {

    public static void main(String[] args) {
	    Ansatt Ola = new Ansatt("Ola", 420);

	    Ola.lonnForMaaned("Januar", 20000,40);
	    Ola.lonnForMaaned("Februar", 15000,25);
	    Ola.lonnForMaaned("Mars", 12000,45);

	    Ola.skrivUtLonnsslipper();

    }

}
