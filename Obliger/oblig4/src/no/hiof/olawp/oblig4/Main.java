package no.hiof.olawp.oblig4;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.*;
import java.util.Collection;


public class Main {

    public static void main(String[] args) {


        //Kode fra oblig2

        //Oppgave 2, lager episode objekter. Kommentert ut pga forløkka som genererer episoder.
        //Episode one = new Episode(1,1, "eps1.0_hellofriend.mov",62,new Date(2013,1,23));
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


        //Kode fra oblig 2 slutt

        //Kode fra oblig 3 start


        //Oppretter noen filmobjekter
        Film goodBadUgly = new Film("The Good, The Bad and the Ugly",161,"A bounty hunting scam joins two men in an uneasy alliance against" +
                " a third in a race to find a fortune in gold buried in a remote cemetery.", new Date(1966,11,23));
        Film americanPsycho = new Film("American Psycho", 102,"A wealthy New York investment banking executive, Patrick Bateman, hides his alternate psychopathic ego from his co-workers and friends as he delves deeper into his violent, hedonistic fantasies."
                ,new Date(2000,6,26));
        Film empireStrikeBack = new Film("Star Wars: The Empire Strikes Back",124,"After the rebels are overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda. His friends accept shelter from a questionable ally as Darth Vader hunts them in a plan to capture Luke."
                ,new Date(1980,9,10));


        //Opprettet noen personobjekter, som blir satt til å være regissøren til filmene vi lagde tidligere
        Person sergioLeone = new Person("Sergio","Leone",60);
        Person maryHarron = new Person("Mary","Harron",48);
        Person irvinKershner = new Person("Irvin","Kershner",69);
        goodBadUgly.setDirector(sergioLeone);
        americanPsycho.setDirector(maryHarron);
        empireStrikeBack.setDirector(irvinKershner);


        //System.out.println(sergioLeone.getName());

        //Person- og rolleobjekter

        Person markHamill  = new Person("Mark","Hamill",66);
        Person carrieFisher  = new Person("Carrie","Fisher",60);
        Person harrisonFord  = new Person("Harrison","Ford",75);
        Person ramiMalek = new Person("Rami","Malek",36);
        Person christianSlater = new Person("Christian","Slater",48);
        Person carlyChaikin = new Person("Carly","Chaikin",27);
        Person bryanCranston = new Person("Bryan", "Cranston",61);
        Person aaronPaul = new Person("Aaron","Paul",38);

        Role lukeSkywalker = new Role("Luke","Skywalker",markHamill);
        Role leiaSkywalker = new Role("Leia","Skywalker",carrieFisher);
        Role hanSolo = new Role("Han","Solo",harrisonFord);
        Role elliotAlderson = new Role("Elliot","Alderson",ramiMalek);
        Role mrRobot = new Role("Mr", "Robot",christianSlater);
        Role darlene = new Role("Darlene","", carlyChaikin);
        Role walterWhite = new Role("Walter","White",bryanCranston);
        Role jessePinkman = new Role("Jesse","Pinkman",aaronPaul);

        //Jobbing med filmobjekter

        //empireStrikeBack.addARole(lukeSkywalker);
        empireStrikeBack.addMultipleRoles(lukeSkywalker,leiaSkywalker,hanSolo);

        //Brukte kodelinjene under for å teste diverse ting. Kunne brukt toString metode her, men beholder det sånn som det er.
        System.out.println(goodBadUgly.getTitle() + " - " +  goodBadUgly.getReleaseDate().getYear()+ ". Director: " + goodBadUgly.getDirector().getName());
        System.out.println(americanPsycho.getTitle() + " - " + americanPsycho.getReleaseDate().getYear()+ ". Director: " + americanPsycho.getDirector().getName());
        System.out.println(empireStrikeBack.getTitle() + " - " + empireStrikeBack.getReleaseDate().getYear()+ ". Director: " + empireStrikeBack.getDirector().getName() + ".\n Actors: \n" + empireStrikeBack.getRoleArray() + "\n \n");


        System.out.println(goodBadUgly);

        System.out.println("\n**************************************");

        //Oppretter et TvShow objekt og noen episode objekter

        TvShow breakingBad = new TvShow("Breaking Bad", "A show about drugs", new Date(2008,20,01));
        Episode pilot = new Episode(1,1,"Pilot",58);
        Episode catsInTheBag = new Episode(2,1,"Cat's in the bag...",48);
        Episode andTheBagsInTheRiver = new Episode(3,1,"...And the bag's in the river",48);

        //Legger episodene inn i et array
        breakingBad.addEpisode(pilot);
        breakingBad.addEpisode(catsInTheBag);
        breakingBad.addEpisode(andTheBagsInTheRiver);
        //Legger til flere roller samtidig i serien Breaking Bad
        pilot.addMultipleRoles(walterWhite,jessePinkman);
        catsInTheBag.addMultipleRoles(walterWhite,jessePinkman);
        andTheBagsInTheRiver.addMultipleRoles(walterWhite,jessePinkman);

        System.out.println(empireStrikeBack);


        System.out.println("********************************************");

        ArrayList<Film> testFilmArray = Film.getFilmArray();
        System.out.println(testFilmArray);
        Collections.sort(testFilmArray);
        System.out.println(testFilmArray);

        System.out.println("********************************************");

        ArrayList<TvShow> testShowArray = TvShow.getTvShowArray();
        System.out.println(testShowArray);
        Collections.sort(testShowArray);
        System.out.println(testShowArray);

    }
}
