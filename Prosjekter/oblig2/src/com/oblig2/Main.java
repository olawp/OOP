package com.oblig2;

public class Main {

    public static void main(String[] args) {
    TVshow Futurama = new TVshow("Futurama", "En serie om fremtiden", "1999");
    TVshow TheSimpsons = new TVshow("The Simpsons", "En serie om en familie", "1989");

    System.out.println(Futurama.getTittel() + " \n" + Futurama.getBeskrivelse() + ". " + Futurama.getUtgivelsesdato());
    }

}
