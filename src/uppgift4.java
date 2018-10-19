import java.util.Scanner;
public class uppgift4 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in); 
		String a;
		System.out.println("skriv något");
		a = input.nextLine();
		System.out.println(sjorovare(a));
		}
	
	public static String sjorovare(String str)
	{
		String klartext = "";
		char k[]= "bcdfghjklmnpqrstvwxz".toCharArray();
		for (int i = 0; i < str.length(); i++ )
		{
		String add = "";
		for (int y = 0; y < k.length; y++) 
		{
		  if (str.charAt(i) == k[y]) 
		  {
			  add = "o" + str.charAt(i);
			  break;
		  }
		}
		klartext = klartext + str.charAt(i) + add;
		}
		return klartext;
	}
	
	

	
}
