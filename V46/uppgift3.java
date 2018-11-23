import java.util.Scanner;

public class uppgift3 {
	
	public static void main(String[] args) {
		int tal = 0;
		int tal2 = 1;
		
		System.out.println("skriv några tal som ska multipliceras");
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			int x = input.nextInt();
			
			tal++;
			
			if(tal == 10) {
				break;
			}
			
			tal2 *= x; 
			
			if(tal2 > 100000) {
				break;
			}
		}
		
		System.out.println( "Resultat " + tal2 + " " + "Count " + "" + tal );
		
	}
	

}
