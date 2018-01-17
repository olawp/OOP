import java.util.Scanner;

public class Oppgave2 {

    public static void main(String[] args) {
        // Oppretter og instansierer et objekt av typen Scanner
        Scanner scanner = new Scanner(System.in);

        // Printer ut til konsollen
        System.out.println("Skriv inn fornavn: ");
        // Leser input fra konsollen
        String fornavn = scanner.nextLine();

		System.out.println("Skriv inn etternavn: ");

		String etternavn = scanner.nextLine();

		System.out.println("Skriv inn alder: ");

		int alder = scanner.nextInt();

        System.out.println("Ditt navn er: " + fornavn + " " + etternavn + ". Alder: " +  alder);
    }

}
