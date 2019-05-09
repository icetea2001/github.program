public class hangWord {
    String clue, visible, secret;

public hangWord() {
    String [] wordList = { "umbrella", "richard Feynman", "american gangster", "titanic" };
    
    String [] clueList = { "Rihanna's song", "Nobel Prize in Physics", "Denzel Washington", "isberg" };
    int rand;
    rand = (int) (Math.random()* wordList.length - 1);
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
    
   
    
    //We make the String secret an array
    for(int i = 0; i < secret.length(); i++) {
        secretArray[i] = secret.charAt(i);
        visibleArray[i] = visible.charAt(i);
    }
    
    //We are uptading our empty visible array
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
//This is a method to check if the secret word is solved
public boolean isSolved()
{   
    return secret.equalsIgnoreCase(visible);
}


}



