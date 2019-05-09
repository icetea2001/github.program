import java.util.Scanner;

public class hangPrime {
	
	static int Mistakes = 4;
	
    public static void main( String[] args) {
       
    	//variabler 
        boolean b = false;
        Scanner scan = new Scanner( System.in);
        
         
        showWelcome();
        hangWord word = new hangWord();
        System.out.println("Your clue: " + word.getClue());
        hangmaninput input = new hangmaninput();
        while (Mistakes > 0 && !word.isSolved())
        {
            System.out.println(word);
            char c = input.getNewLetter();
            if (!word.update(c))
                Mistakes = Mistakes - 1 ;
        }
        if (word.isSolved())
            System.out.println("Great, you done it.");
        else
            System.out.println("Sorry, too many errors.");
       
    }
    
        
        public static void showWelcome()
        {
            System.out.println( "Welcome to Hangman Game:)!!" );
            System.out.println("you have 4 lives to spare!!!");
        }
        
}
