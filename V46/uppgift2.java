import java.util.Scanner;


public class uppgift2 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String ord = "";
		boolean close = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv något");
		
		while (close != true) {
			ord = input.nextLine();
			if (ord.equals("exit")) {
				close = true;
				
			}
		}

	}

}
