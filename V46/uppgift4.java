import java.util.Scanner;

public class uppgift4 {
	
	public static void main(String[] args) {
		
		int tal = 0;
		int tal2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(tal <= 10000) {
			if (tal %7 == 0)
				tal2 += tal;
			tal++;
				
		}
			
			System.out.println(tal2);
		
	}

}
