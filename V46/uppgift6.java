import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("bas ? ");
		int bas = sc.nextInt();
		
		for (int x = 0; x < bas; x++) {
			for (int y = 1; y < bas - x; y++) {
				System.out.print(" ");
			}
			for (int y = 0; y <= x; y++) {
				System.out.print("X ");
			}
			System.out.println();
		}
	}

}
