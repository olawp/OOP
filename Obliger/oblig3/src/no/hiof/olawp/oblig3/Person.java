package no.hiof.olawp.oblig3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + ". Age: " + age;
    }

    public String getName(){
        return firstName + " " +  lastName;
    }
}
