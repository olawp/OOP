package no.hiof.olawp.figurarv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4,5);
        Sirkel sirkelen = new Sirkel(5);
        Kvadrat kvadratet = new Kvadrat(8);

        System.out.println("Figur med areal: " + rektangelet.areal() + " og omkrets: " + rektangelet.omkrets());
        System.out.println("Figur med areal: " + sirkelen.areal() + " og omkrets: " + sirkelen.omkrets() +". Diameter: " + sirkelen.beregnDiamater() );
        System.out.println("Figuren med areal: " + kvadratet.areal() + " og omkrets: " + kvadratet.omkrets());

        if(erStorre(rektangelet,sirkelen))
            System.out.println(rektangelet + "er størst.");
            else
            System.out.println(sirkelen + "er størst.");

        System.out.println("***********************\n");


        Figur[] figurArray = new Figur[4];

        /*figurArray[0] = rektangelet;
        figurArray[1] = sirkelen;
        figurArray[2] = kvadratet;
        for (int i = 0; i < figurArray.length; i++){

            if (figurArray[i] != null)
                System.out.println(figurArray[i].areal());
        }*/

        ArrayList<Figur> figurArrayListe = new ArrayList<>();

        figurArrayListe.add(rektangelet);
        figurArrayListe.add(kvadratet);
        figurArrayListe.add(sirkelen);
        figurArrayListe.add(kvadratet);


        for (Figur aFigurArrayListe : figurArrayListe) {
            System.out.println(aFigurArrayListe);

            if(aFigurArrayListe instanceof Sirkel){
                Sirkel enSirkel = (Sirkel) aFigurArrayListe;
                System.out.println("Diameteren er: " + enSirkel.beregnDiamater());
            }

        }
    }

    public static  boolean erStorre(Figur figur1, Figur figur2 ){
        return figur1.areal() > figur2.areal();
    }
}
