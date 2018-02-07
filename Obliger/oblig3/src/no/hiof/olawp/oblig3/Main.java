package no.hiof.olawp.oblig3;

import java.util.Date;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        //Oppgave 2, lager episode objekter. Kommentert ut pga forløkka som genererer episoder.
        //Episode one = new Episode(1,1, "eps1.0_hellofriend.mov",62);
        //Episode two = new Episode(2, 1, "eps1.1_ones-and-zzer0es.mpeg",48);

        //Oppgave 2, lager TvShow objekt
        TvShow MrRobot = new TvShow("Mr Robot", "Follows Elliot, a young programmer working as a cyber-security engineer by day, and a vigilante hacker by night."
                ,new Date(2015,07,24));

        //Oppgave 2, testing av å legge til i array
        //MrRobot.addEpisode(one);
        //MrRobot.addEpisode(two);




        //Oppgave 4 og 6
        //Nesta for-løkke for å generere 100 episoder, med tilfeldig runtime mellom 20 og 30 min.
        for (int i = 1;i < 6;i++){
            for (int j = 1; j <=20;j++){
                MrRobot.addEpisode(new Episode(j, i,"EP " + j, new Random().nextInt(10+1)+20));
            }
        }



        //Skriver ut alle episodene som hører til MrRobot og som bruker toString metoden
        System.out.println(MrRobot);

        System.out.println("***************************************");

        //Printer ut alle episodene fra en spesifikk sesong.
        MrRobot.printSeason(4);
        System.out.println("Number of seasons: " + MrRobot.getNumberOfSeasons());


        //MrRobot.printSeason(1);
        System.out.println("Average runtime is: " + MrRobot.getAvgRuntime() + " minutes.");















    }
}
