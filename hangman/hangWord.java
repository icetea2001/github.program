public class hangWord {
    static String clue, visible, secret;

public hangWord() { //lista på ord och ledtrådar för spelet
    String [] wordList = { "umbrella", "richard Feynman", "american gangster", "titanic" };
    
    String [] clueList = { "Rihanna's song", "Nobel Prize in Physics", "Denzel Washington", "isberg" };
    int rand;
    rand = (int) (Math.random()* wordList.length - 1); //håller koll på ordets längd
    secret = wordList[rand];
    clue = clueList[rand];
    int wordLength = secret.length();
    
    visible = ""; //gör som space inte är behövst skrivas av användaren
    
    for ( int i = 0; i < secret.length(); i++) //skriver ut bindesstreck där det ska vara bokstäver och sätter mellanrum där de,t ska vara mellanrum istället för bindessträck
    {
        char c = secret.charAt(i);
        
        if ( c == ' ' )
            visible += c;
        else
            visible += '-';
    }
}

public String getClue() {
	
    return clue;
}

public String toString() {
	
    return visible;
}

public boolean update(char c) {
	
	
	String s = "";
	 boolean contains = false;
    char[] secretArray = new char [secret.length()];
    char[] visibleArray = new char [secret.length()];
    
   
    
    //gör String secret til array
    for(int i = 0; i < secret.length(); i++) {
        secretArray[i] = secret.charAt(i);
        visibleArray[i] = visible.charAt(i);
    }
    
    //vi uppdaterar den toma visible array
    for(int k = 0; k < secret.length();k++)
    {
        
        if(secretArray[k] == c)
        {
            visibleArray[k] = c;
            contains = true;
        }
    }
    //We are changing our visible array into the visible string
    for(int m=0; m < secret.length(); m++ )
    {
        s = s + visibleArray[m];
    }
    visible = s;
    
    return contains;
}
//en metod för att kolla om du gissa rätt på secretword 
public boolean isSolved()
{   
    return secret.equalsIgnoreCase(visible);
}


}



