import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

public class hangmanp {
	static String ord; // det är ordet du gissa på
	static Scanner input = new Scanner(System.in); // tar in Scanner

	// gör variabler för att använa i min kod
	static int tries = 0; // antal användarens gissningar
	static String guess; // gissning under spelets gång
	static char guessC;
	static String hidden = "";
	static ArrayList<Character> cor = new ArrayList<Character>(); // lista med korrekta gissningar
	static boolean exit = false; //variabel för att stänga loop när man spelat klart
   
	
	public static void main(String[] args) {

		System.out.println("välkommen till hangman" + "\ndu har 10 försök" );
		ordet(); //kallar klassen ordet
		
	}

	public static void ordet() {
		String[] lista = { "program", "lampa", "skulptur", "idiot" }; //lista av ord som kan komma under spelet
		Random randomW = new Random(); //gör randomW som den väljer en random siffra mellan 0-3
		int randomN = randomW.nextInt(lista.length); //
		ord = lista[randomN];
		guess();
	}
	

	public static void guess() {
		System.out.println("börja gissa");
		
	do {	
		int y=0;
		int won = 0;
		int count = 0;
		do {
			
			if (cor.contains(ord.charAt(y))) {
				System.out.print(ord.charAt(y)); //om cor arraylist innehåller bokstaven som finns i ord skriver den ut bokstaven där den ska va
			} 
			else {
				System.out.print("-"); //annars så sätter den ut "-"
				won = 1; //won är 1 så länge den skriver ut "-"
			}
			y++;
			
			
		

		}
		while(y < ord.length());// så länge y (som är antal rätta bokstäver) är mindre än ordets antal bokstäver

		
		
		if(won == 0) {
			System.out.println("\nyou won!!!");
			exit = true;
		}
		
			System.out.println(); 
			guess = input.nextLine().toLowerCase(); 
			if (guess.equals(ord)) { //om guess är exakt lika som ord händer detta
				System.out.println("du vann");
				exit = true;
			}	
			
			else if (guess.length()== 1) { // om guess bara är en bokstav händer detta
				for (int i = 0; i < ord.length(); i++) { 
					if (ord.charAt(i) == guess.charAt(0)) { // om guess bokstaven är lika med någon ord bokstav
						cor.add(guess.charAt(0)); //  adda bokstav i arraylist cor 
					    count++; // count plus 1 om detta händer
					    }
					}
				}
		if (count== 0) {
			tries++; //försök (försök som du har på dig under spelet)
			System.out.println("antal försök: " + tries);
		}

	 else {
		System.out.println("antal försök: " + tries);
	}

	if (tries == 10) { //om tries blir lika med 10 så förlorar man
		System.out.println("du förlora");
		System.out.println("ordet var: " + ord);
		exit = true;
	}
				
		}while(!exit); //sålänge exit inte är true

} 
}

		
