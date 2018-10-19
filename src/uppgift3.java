import java.util.Scanner;

public class uppgift3 {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		char a;
		String str;
		System.out.println("skriv ett ord och en bokstav");
		str = input.nextLine().toLowerCase();
		a = input.nextLine().toLowerCase().charAt(0);
		System.out.println(count(str, a));
	}
	
	public static int count (String str, char a)
	{
		int counter = 0;
		for (int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == a)
				counter++;
		  }
		
		return counter;
		
		}
	
	
}
