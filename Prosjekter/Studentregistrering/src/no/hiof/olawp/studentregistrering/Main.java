package no.hiof.olawp.studentregistrering;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	    Kurs androidProgrammering = new Kurs("Android Programmering", "ITF1337", 10);


	    Student albertEinstein = new Student("Albert","Einstein", 69);

	    System.out.println(albertEinstein.getFornavn() + " " + albertEinstein.getEtternavn() + " tar kurset: ");

	    albertEinstein.leggTilKurs(androidProgrammering);

	    albertEinstein.leggTilKurs(new Kurs("OOP", "ITF420",20));

        ArrayList<Kurs> albertKurs =albertEinstein.getKurs();

        for (int i = 0; i<albertKurs.size();i++) {

            Kurs kurs = albertKurs.get(i);

            System.out.println(kurs.getNavn());
        }
    }
}
