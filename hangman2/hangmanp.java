import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class hangmanp {
	static String ord;  //det �r ordet du gissa p�
	static Scanner input = new Scanner(System.in); // tar in Scanner

	// g�r variabler f�r att anv�na i min kod
	static int tries = 0;  // antal anv�ndarens gissningar
	static String guess; // gissning under spelets g�ng
	//static char guessC;
	//static String hidden = "";
	static ArrayList<Character> cor = new ArrayList<Character>();  //lista med korrekta gissningar
	static boolean exit = false; //

	public static void main(String[] args) {

		System.out.println("v�lkommen gissa ordet");
		ordet(); 
	}

	public static void ordet() {
		String[] lista = { "program", "lampa", "skulptur", "idiot" };
		Random randomW = new Random();
		int randomN = randomW.nextInt(lista.length);
		ord = lista[randomN];
		System.out.println(ord);
		guess();
	}

	public static void guess() {
		System.out.println("b�rja gissa, du har 5 f�rs�k");
		do {
			for (int y = 0; y < ord.length(); y++) {
				if (cor.contains(ord.charAt(y))) {
					System.out.print(ord.charAt(y));
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			guess = input.nextLine().toLowerCase();
			if (guess.equals(ord)) {
				System.out.println("du vann");
				exit = true;
			
}