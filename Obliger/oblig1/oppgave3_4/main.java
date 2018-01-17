import java.util.Scanner;

public class main {
	
	public static void main(String [] args){
		//Istansierer nye studentobjekter
		Student Ola = new Student("Ola", "Wethal Petersen", 20);
		Student Karen = new Student("Karen","Molina", 21);
		Student David = new Student("David", "Aarlien", 20);
		Student Arne = new Student("Arne","Arnesen",25);

		//Oppretter en scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Skriv inn fornavn: ");
		String fName = in.nextLine();
		System.out.println("Skriv inn etternavn: ");
		String lName = in.nextLine();
		System.out.println("Skriv inn alder: ");
		int age = in.nextInt();

		//Oppretter studentinstanse med infoen fra kommandolinja
		Student opprettStudent = new Student(fName,lName,age);
		opprettStudent.setlName("Etternavnersen");
		System.out.println(opprettStudent.getfName()+ " " + opprettStudent.getlName()+ " " + opprettStudent.getAge());

		//Henter og printer ut informasjon
		System.out.println(Ola.getfName() + " " + Ola.getlName()+ ". Alder: " + Ola.getAge());
		System.out.println(David.getfName()+ " " + David.getlName()+". Alder: " + David.getAge());
        System.out.println(Arne.getfName() + " " + Arne.getlName()+". Alder: " + Arne.getAge());

        //Endrer på for- og etternavn til studenten Arne ved å leke med set metoden
        Arne.setfName("David");
        Arne.setlName("OOP Lord");
        //Printer ut studenten med den ny infoen
        System.out.println(Arne.getfName()+ " " + Arne.getlName());
	}
}