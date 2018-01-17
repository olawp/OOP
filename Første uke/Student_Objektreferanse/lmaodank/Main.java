package lmaodank;

public class Main {
	public static void main(String[]args){
		Student nikola = new Student();

		nikola.setFornavn("Nikola");
		nikola.setEtternavn("Tesla");
		nikola.setStudentId("69");


		System.out.println(nikola.getFornavn());

		Student student1 = new Student("Anders","Hansen","1337");

		Student student2 = student1;
		System.out.println("Student1: " + student1.getEtternavn());
		System.out.println("Student2: " + student2.getEtternavn());

		student2.setEtternavn("Johansen");

		System.out.println("Student1:" + student1.getEtternavn());
		System.out.println("Student2:" + student2.getEtternavn());
		

	}
}