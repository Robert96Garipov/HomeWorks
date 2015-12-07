import java.util.*;

public class Game {
    Scanner sc;
    
    public Game(){
        sc = new Scanner(System.in);
        String word = getWord();
        
        System.out.println("Guess a 4-letter word");
        
        while(true)
        {
            try{
                String input = sc.nextLine();
                
                int bull = 0; int cow = 0;
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == input.charAt(i)) bull++;
                    else cow++;
                }
                    
                if(bull == 4) {
                    System.out.println("You win!");
                    break;
                }
                else
                    printOutput(bull, cow);
            }
            catch(Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    public String getWord(){
        String[] data = {"bike","tree","home","note","pain","desk","wind","park","game","hope"};
        int i = (int)Math.round(Math.random()*9);
        return data[i]; 
    }
    
    public void printOutput(int bull, int cow){
        System.out.println("Bull(s): " + Integer.toString(bull) + " Cow(s): " + Integer.toString(cow));
    }
} 