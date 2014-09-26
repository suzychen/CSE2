////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//RandomGames Java Program
//This program prompts users to enter one of three choices for a game of chance
//(1) Roulette; (2) Craps; or (3) Picking a card from a deck of plaing cards. Then
//the program will print the results of a play at the game chosen.

//  first compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames
    import java.util.Scanner;

//define a class
public class RandomGames{
    //my method
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        //roulette outcome is an int between 0 and 37
        int rouletteOutcome=(int)(Math.random()*38); 
        int craps1=(int)(Math.random()*6+1);
        int craps2=(int)(Math.random()*6+1);
        int crapsOutcome=craps1+craps2;
        
        //prompt the user to enter the game they want to play
        System.out.print(
            "Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        String character=myScanner.next();
        
        if (character.length()==1){
            if (character.equals("R") || character.equals ("r")) {
                switch (rouletteOutcome%38){
                    case 37: System.out.println("Roulette: "+"00");break;
                    default: System.out.println("Roulette: "+rouletteOutcome);
                }
            }
            else if (character.equals("C") || character.equals ("c")) {
                System.out.println("Craps is not implemented yet.");
            }
            else if (character.equals("P") || character.equals ("p")) {
                System.out.println("Picking a card is not implemented yet.");
            }
            else{
                System.out.println("You did not enter 'P'' or 'p' or 'C' or 'c' or 'P'or p'.");
            }
        }
        else {
            System.out.println("a single character expected");
        }
         
    }
}