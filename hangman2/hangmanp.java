import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

public class hangmanp {
	static String ord; // det �r ordet du gissa p�
	static Scanner input = new Scanner(System.in); // tar in Scanner

	// g�r variabler f�r att anv�na i min kod
	static int tries = 0; // antal anv�ndarens gissningar
	static String guess; // gissning under spelets g�ng
	static char guessC;
	static String hidden = "";
	static ArrayList<Character> cor = new ArrayList<Character>(); // lista med korrekta gissningar
	static boolean exit = false; //variabel f�r att st�nga loop n�r man spelat klart

	public static void main(String[] args) {

		System.out.println("v�lkommen till hangman" + "\ndu har 5 f�rs�k" );
		ordet(); //kallar klassen ordet
		
	}

	public static void ordet() {
		String[] lista = { "program", "lampa", "skulptur", "idiot" }; //lista av ord som kan komma under spelet
		Random randomW = new Random(); //g�r randomW som den v�ljer en random siffra mellan 0-3
		int randomN = randomW.nextInt(lista.length); //
		ord = lista[randomN];
		guess();
	}
	

	public static void guess() {
		System.out.println("b�rja gissa");
		
	do {	
		int y=0;
		int won = 0;
		int count = 0;
		do {
			
			if (cor.contains(ord.charAt(y))) {
				System.out.print(ord.charAt(y));
			} 
			else {
				System.out.print("-");
				won = 1;
			}
			y++;
			
			
		

		}
		while(y < ord.length());

		if(won == 0) {
			System.out.println("\nyou won!!!");
			exit = true;
		}
		
			System.out.println();
			guess = input.nextLine().toLowerCase();
			if (guess.equals(ord)) {
				System.out.println("du vann");
				exit = true;
			}	
			
			else if (guess.length()== 1) {
				System.out.println("Du har gissat p� en bokstav");
				for (int i = 0; i < ord.length(); i++) {
					if (ord.charAt(i) == guess.charAt(0)) {
						cor.add(guess.charAt(0));
					    count++;
					    }
					}
				}
		if (count== 0) {
			tries++;
			System.out.println("antal f�rs�k: " + tries);
		}

	 else {
		System.out.println("antal f�rs�k: " + tries);
	}

	if (tries == 5) {
		System.out.println("du f�rlora");
		System.out.println("ordet var: " + ord);
		exit = true;
	}
				
		}

	while(!exit);
}
}

		
