package main;

import java.util.Scanner;

public class main {

    public static void main(String [] args){

        Student Ola = new Student("Ola", "Wethal Petersen", 20);
        Student David = new Student("David", "Aarlien", 20);
        Student Per = new Student("Per","Holm",22);
        Student Herman = new Student("Herman Johan","Dragland",21);
        Student Karen = new Student("Karen", "Molina", 21);
        Student Joakim = new Student("Joakim","Jæger",25);
        Student Arne = new Student("Arne","Arnesen",25);


        //Scanner for å legge til nye studenter(Legger ikke til nye student objekter i denne fila)
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn fornavn: ");
        String fName = in.nextLine();
        System.out.println("Skriv inn etternavn: ");
        String lName = in.nextLine();
        System.out.println("Skriv inn alder: ");
        int age = in.nextInt();

        //Test av no lok greier
        Student opprettStudent = new Student(fName,lName,age);
        //Enderer
        opprettStudent.setlName("Etternavnersen");
        //Utskrift av lok
        System.out.println(opprettStudent.getfName()+ " "+ opprettStudent.getlName() + ". Alder: " +opprettStudent.getAge());

        //Utskrift av studenter
        System.out.println(Ola.getfName()+" "+ Ola.getlName()+ ". Alder: " + Ola.getAge());
        System.out.println(David.getfName()+ " " + David.getlName()+". Alder: " + David.getAge());
        System.out.println(Arne.getfName() + " " + Arne.getlName()+". Alder: " + Arne.getAge());

        //Endrer på for- og etternavn til studenten Arne
        Arne.setfName("David");
        Arne.setlName("OOP Lord");
        //Printer ut studenten med den ny infoen
        System.out.println(Arne.getfName()+ " " + Arne.getlName());
    }
}
