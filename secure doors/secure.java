import java.util.Scanner;
import java.util.ArrayList;
public class secure{
	static ArrayList<String> nameList = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	static boolean output = false;
    static int xcount = 0;
    static int co1 = 0;
    
    public static void main(String[] args) { start();
    
    input.nextLine(); //buffer
        inputCheck(); }

    public static void start() {
        while(xcount < 0 || xcount > 1000) {
 xcount = input.nextInt();}
    }

    public static void inputCheck() {
        while(!output) {
            String[] nameInput = input.nextLine().split(" ");
            if (nameInput[0].equals("entry") && nameList.contains(nameInput[1])){
                System.out.println(nameInput[1] + " entered ANOMALY"); co1++;}
            if(nameInput[0].equals("out") && !nameList.contains(nameInput[1])) {
                System.out.println(nameInput[1] + " outed ANOMALY"); co1++;}
            if(nameInput[0].equals("entry")) {
                nameList.add(nameInput[1]);
                System.out.println(nameInput[1] + " entered"); co1++;}
            if(nameInput[0].equals("out")) {
                nameList.remove(nameInput[1]);
                System.out.println(nameInput[1] + " outed"); co1++; } 
            if(co1 == xcount) {
                output = true;
            }
        }
    }

}
	
	
	

