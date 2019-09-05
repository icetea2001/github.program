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

		System.out.println("v�lkommen till hangman" + "\ndu har 10 f�rs�k" );
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
				System.out.print(ord.charAt(y)); //om cor arraylist inneh�ller bokstaven som finns i ord skriver den ut bokstaven d�r den ska va
			} 
			else {
				System.out.print("-"); //annars s� s�tter den ut "-"
				won = 1; //won �r 1 s� l�nge den skriver ut "-"
			}
			y++;
			
			
		

		}
		while(y < ord.length());// s� l�nge y (som �r antal r�tta bokst�ver) �r mindre �n ordets antal bokst�ver

		
		
		if(won == 0) {
			System.out.println("\nyou won!!!");
			exit = true;
		}
		
			System.out.println(); 
			guess = input.nextLine().toLowerCase(); 
			if (guess.equals(ord)) { //om guess �r exakt lika som ord h�nder detta
				System.out.println("du vann");
				exit = true;
			}	
			
			else if (guess.length()== 1) { // om guess bara �r en bokstav h�nder detta
				for (int i = 0; i < ord.length(); i++) { 
					if (ord.charAt(i) == guess.charAt(0)) { // om guess bokstaven �r lika med n�gon ord bokstav
						cor.add(guess.charAt(0)); //  adda bokstav i arraylist cor 
					    count++; // count plus 1 om detta h�nder
					    }
					}
				}
		if (count== 0) {
			tries++; //f�rs�k (f�rs�k som du har p� dig under spelet)
			System.out.println("antal f�rs�k: " + tries);
		}

	 else {
		System.out.println("antal f�rs�k: " + tries);
	}

	if (tries == 10) { //om tries blir lika med 10 s� f�rlorar man
		System.out.println("du f�rlora");
		System.out.println("ordet var: " + ord);
		exit = true;
	}
				
		}while(!exit); //s�l�nge exit inte �r true

} 
}

		
