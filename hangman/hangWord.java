public class hangWord; {
    String clue, visible, secret;

public SecretWord() {
    String [] wordList = { "Umbrella", "Richard Feynman", "American Gangster", "titanic" };
    
    String [] clueList = { "Rihanna's song", "Nobel Prize in Physics", "Denzel Washington", "isberg" };
    int rand;
    rand = (int) (Math.random()*4);
    secret = wordList[rand];
    clue = clueList[rand];
    int wordLength = secret.length();
    
    visible = "";
    
    for ( int i = 0; i < secret.length(); i++)
    {
        char c = secret.charAt(i);
        
        if ( c == ' ' )
            visible += c;
        else
            visible += '_';
    }
}

public String getClue() {
	
    return clue;
}

public String toString(){
	
    return visible;
}




}


