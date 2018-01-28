package no.hiof.olawp.oblig2;

import java.util.Date;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
	    //Episode one = new Episode(1,1, "eps1.0_hellofriend.mov",45);
	    //Episode two = new Episode(2, 1, "eps1.1_ones-and-zzer0es.mpeg",48);*/


	    TvShow MrRobot = new TvShow("Mr Robot", "Follows Elliot, a young programmer working as a cyber-security engineer by day, and a vigilante hacker by night."
        ,new Date(2015,07,24));

	    //Oppgave 2, testing av å legge til i array
	    //MrRobot.addEpisode(one);
	    //MrRobot.addEpisode(two);

        //Nesta for-løkke for å generere 100 episoder
        for (int i = 1;i < 6;i++){
            for (int j = 1; j <=20;j++){
                MrRobot.addEpisode(new Episode(j, i,"EP " + j, new Random().nextInt(10+1)+20));
            }
        }


        //Skriver ut alle episodene som hører til MrRobot og som bruker toString metoden
        //System.out.println(MrRobot);
        MrRobot.printSeason(3);

        //MrRobot.printSeason(1);
        System.out.println("Averge runtime is: " + MrRobot.getAvgRuntime() + " minutes.");









    }
}
