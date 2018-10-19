	
import java.util.Scanner; 

public class läxav41 {
	  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("skriv in radien");
		double r = input.nextDouble();
		System.out.println(volym(r));
	}
	
	public static double volym(double r) {
		return (4 * Math.PI * Math.pow(r, 3)) / 3;
	}


}


