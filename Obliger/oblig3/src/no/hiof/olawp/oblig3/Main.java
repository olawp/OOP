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


        System.out.println("***************************************");

        Film goodBadUgly = new Film("The Good, The Bad and the Ugly",161,"A bounty hunting scam joins two men in an uneasy alliance against" +
                " a third in a race to find a fortune in gold buried in a remote cemetery.", new Date(1966,11,23));
        Film americanPsycho = new Film("American Psycho", 102,"A wealthy New York investment banking executive, Patrick Bateman, hides his alternate psychopathic ego from his co-workers and friends as he delves deeper into his violent, hedonistic fantasies."
                ,new Date(2000,6,26));
        Film empireStrikeBack = new Film("Star Wars: The Empire Strikes Back",124,"After the rebels are overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda. His friends accept shelter from a questionable ally as Darth Vader hunts them in a plan to capture Luke."
        ,new Date(1980,9,10));



        Person sergioLeone = new Person("Sergio","Leone");
        Person maryHarron = new Person("Mary","Harron");
        Person irvinKershner = new Person("Irvin","Kershner");
        goodBadUgly.setDirector(sergioLeone);
        americanPsycho.setDirector(maryHarron);
        empireStrikeBack.setDirector(irvinKershner);

        System.out.println(goodBadUgly.getTitle() + " - " +  goodBadUgly.getReleaseDate().getYear()+ ". Director: " + goodBadUgly.getDirector());
        System.out.println(americanPsycho.getTitle() + " - " + americanPsycho.getReleaseDate().getYear()+ ". Director: " + americanPsycho.getDirector());
        System.out.println(empireStrikeBack.getTitle() + " - " + empireStrikeBack.getReleaseDate().getYear()+ ". Director: " + empireStrikeBack.getDirector());




    }
}
