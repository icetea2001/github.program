import java.util.Scanner;
import java.util.Random;

public class speluppgift {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);    //tar in Scanner
		
		Random rand = new Random();
		int numberguess = rand.nextInt(1000);        //g�r variabler f�r att anv�na i min kod
		int numberoftries = 0;
		int guess;
		boolean win = false;
		boolean exit = false;
		System.out.println("guess a number between 1 and 1000: ");
	
		do {
		while (win == false) {            //g�r while loop (f�r vet inte hur m�nga g�nger den kommer g� om) f�r att man ska kunna testa tills man har r�tt
		
		
		guess = input.nextInt();   
		numberoftries++;
		
		if (numberoftries == 10) {
			System.out.println("Du f�rlora");
			break;
		}
		else if (guess == numberguess) {   // g�r if och else if satser f�r att s�ga till vad som ska skicka tillbaka beroende p� spelarens svar 
			
			win = true;
		}
		else if (guess < numberguess) {
			
			System.out.println("your guess is to low");
		}
		else if (guess > numberguess) {
			
			System.out.println("your number is to high");
		}
		
		}
		
		System.out.println("you win!");
		System.out.println("it took you " + numberoftries + " times");
		
		System.out.println("Villu k�ra igen? tryck 1");
		guess = input.nextInt();
		if (guess == 1) {
			win = false;
			numberoftries = 0;
			numberguess = rand.nextInt(1000); 
			System.out.println("guess a number between 1 and 1000: ");
		}else {
			exit = true;
		}
		
		}while(!exit);
		
	}

}
