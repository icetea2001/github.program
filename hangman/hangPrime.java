import java.util.Scanner;
import java.util.ArrayList;

public class hangPrime {
	
	static int Mistakes = 4; //gör den static som jag kan använda den i alla filer 
	
    public static void main( String[] args) {
       
    	//variabler 
        boolean b = false;
        Scanner scan = new Scanner( System.in);
        char[] letter = { };
        
         // starten på spelet. väljer ord och skriver ut välokmandeoch information 
        showWelcome();
        hangWord word = new hangWord();
        System.out.println("Your clue: " + word.getClue());
        hangmaninput input = new hangmaninput();
        while (Mistakes > 0 && !word.isSolved())
        {
            System.out.println(word);  //håller koll på liv och minskar om du skriver en bokstav som inte är med
            char c = input.getNewLetter();
            if (!word.update(c))
                Mistakes = Mistakes - 1 ;
        }
        
        if (word.isSolved())  //säger vad den ska skriva ut om du vinner
            System.out.println("congrats, you won.");
        else
            System.out.println("Sorry, too many errors.");
            System.out.println("the word was " + hangWord.secret);
       
    }
    
        
        public static void showWelcome() // säger vad den ska skriva ut uppe i showwelcome
        {
            System.out.println( "Welcome to Hangman Game:)!!" );
            System.out.println("you have 4 lives to spare!!!");
        }
        
}
