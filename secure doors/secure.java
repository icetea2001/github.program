import java.util.Scanner;
import java.util.ArrayList;
public class secure{
	static ArrayList<String> nList = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	static boolean output;
    static int xcount = 0;
    static int co1 = 0;
    
    public static void main(String[] args) { start();
    output = false;
    input.nextLine(); //buffer
        inputCheck(); }

    public static void start() {
        while(xcount < 0 || xcount > 1000) {
 xcount = input.nextInt();}
    }

    public static void inputCheck() {
        while(!output) {
            String[] nameInput = input.nextLine().split(" ");
            if (nameInput[0].equals("entry") && nList.contains(nameInput[1])){
                System.out.println(nameInput[1] + " entered ANOMALY"); co1++;}
            if(nameInput[0].equals("exit") && !nList.contains(nameInput[1])) {
                System.out.println(nameInput[1] + " exited ANOMALY"); co1++;}
            if(nameInput[0].equals("entry")) {
                nList.add(nameInput[1]);
                System.out.println(nameInput[1] + " entered"); co1++;}
            if(nameInput[0].equals("exit")) {
                nList.remove(nameInput[1]);
                System.out.println(nameInput[1] + " exited"); co1++; } 
            if(co1 == xcount) {
                output = true;
            }
        }
    }

}
	
	
	

