import java.util.Scanner;

public class uppgift2 {

		
		public static void main (String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("skriv något ord");
			String str = scanner.nextLine();
			
			
			
			String res = res(str);
			
			System.out.println(res);
			
			scanner.close();
			
		}
		
		public static String res(String str) {
			String res = "";
			for (int i = str.length() -1; i >= 0; i--) {
			res += str.charAt(i);	
			}
			
			return res;
			
			}

	}


