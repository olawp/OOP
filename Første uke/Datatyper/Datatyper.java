public class Datatyper {

	public static void main(String[]args) {
		//Deklarerer og initialiserer variabelen alder med datatype byte
		byte alder = 20;

		//Deklarer
		short antallStudenter;
		//Initialiserer
		antallStudenter = 171;

		int antallAnsatte = 350;

		long jordensOmkrets = 4007500093871692387L;

		int rarUtregning = alder + antallStudenter + antallAnsatte;

		System.out.println("Sum = " + rarUtregning);

		float timeLonn = 205.5F;

		double antallTimer = 2356.5;

		System.out.println(timeLonn * antallTimer); 

		char karakter = 'A';

		boolean obligerGodkjent = true;

		System.out.println(karakter);

		System.out.println("Ola er lit af");
	}
}