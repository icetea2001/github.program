import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
		
		double tal1 = 1; // måste vara över noll för annars skulle loopen inte godkäna 
		double tal2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv ett nummer: ");
		
		while (tal1 != 0) { // skapar loop
			
			tal1 = input.nextDouble();
			tal2 += tal1; // samma som tal2 = tal2 + tal
		}
		
		System.out.println("the sum of all numbers is" + tal2);
		
		
	}
}
