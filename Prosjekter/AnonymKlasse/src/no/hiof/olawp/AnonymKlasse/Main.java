package no.hiof.olawp.AnonymKlasse;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<SafariDyr> dyrSettPaaSafari = new ArrayList<>();

        dyrSettPaaSafari.add(new SafariDyr("Baloo","Bjørn", 32));
        dyrSettPaaSafari.add(new SafariDyr("Bagera","Panter", 22));
        dyrSettPaaSafari.add(new SafariDyr("Shere Khan","Tiger", 12));
        dyrSettPaaSafari.add(new SafariDyr("Kha","Slange", 68));

        System.out.println(dyrSettPaaSafari);

        Collections.sort(dyrSettPaaSafari);
        System.out.println("Sortert liste: ");
        System.out.println(dyrSettPaaSafari);
    }
}
