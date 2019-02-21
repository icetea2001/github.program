import java.util.Scanner;
import java.util.Random;

public class speluppgift {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		int numberguess = rand.nextInt(1000);
		int numberoftries = 0;
		int guess;
		boolean win = false;
		
		while (win == false) {
		
		System.out.println("guess a number between 1 and 1000: ");
		
		guess = input.nextInt();
		numberoftries++;
		
		if (guess == numberguess) {
			
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
		

	}

}
