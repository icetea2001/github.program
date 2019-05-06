import java.util.Scanner;

public class hangPrime {
	
    public static void main( String[] args) {
       
    	//variabler
    	int Mistakes = 0; 
        boolean b = false;
        Scanner scan = new Scanner( System.in);
         
        showWelcome();
        SecretWord word = new SecretWord();
        System.out.println("Your clue: " + word.getClue());
        KeyboardInput input = new KeyboardInput();
        while (Mistakes < 4 && !word.isSolved())
        {
            System.out.println(word);
            char c = input.getNewLetter();
            if (!word.update(c))
                Mistakes = Mistakes + 1 ;
       