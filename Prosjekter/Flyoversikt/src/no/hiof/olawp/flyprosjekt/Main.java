package no.hiof.olawp.flyprosjekt;

public class Main {

    public static void main(String[] args) {
        Fly b747 = new Fly("747", 2);

        b747.leggTilEnPassasjer();
        b747.leggTilEnPassasjer();
        b747.leggTilEnPassasjer();

        System.out.println(b747.getModell() + " " + b747.getPassasjerer() + " " + b747.getSeter());

        Transportfly an225 = new Transportfly(800, "An-225", 5);

        an225.leggTilEnPakke(5,5,5);

        System.out.println(an225.getMaksLast() + " " + an225.getBruktLast());

        an225.leggTilEnPassasjer();

        System.out.println(an225.getPassasjerer() + " " + an225.getSeter());

        System.out.println(b747);

        System.out.println(an225);

        Fly[] skvadron = new Fly[5];

        skvadron[0] = new Fly();
        skvadron[1] = new Transportfly(800,"AN-224",15);
        skvadron[2] = new Transportfly(700, "AN-223",10);
        skvadron[3] = new Fly();
        skvadron[4] = new Fly();

        for (int i = 0;i<skvadron.length;i++){
            System.out.println(skvadron[i].toString());
        }
    }
}
