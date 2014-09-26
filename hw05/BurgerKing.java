//////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//BurgerKing Java Program
//This program prompts the user to enter a choice of a burger, a soda, or fries
//and then prompts the user for details of their choices.

//  first compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing

    import java.util.Scanner;

//define a class
public class BurgerKing {
    //my method
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        System.out.print(
            "Enter a letter to indication a choice of "+
            "Burger (B) or (b) "+
            "Soda (S) or (s) "+
            "Fries (F) or (f)");
        String choice=myScanner.next();
        
        switch(choice){
            case "B":
            case "b":
                System.out.print("Enter A or a for all the fixins "+
                "C or c for cheese "+
                "N or n for none of the above");
                String choiceBurger=myScanner.next();
                if (choiceBurger.equals ("A") || choiceBurger.equals ("a")){
                    System.out.println("You ordered a burger with all the fixins.");
                }
                else if (choiceBurger.equals ("C") || choiceBurger.equals ("c")){
                    System.out.println("You ordered a burger with cheese.");
                }
                else if (choiceBurger.equals ("N") || choiceBurger.equals ("n")){
                    System.out.println("You ordered a burger with none of the above.");
                }
                else {
                    System.out.println("Your input is not legitimate.");
                }
            break;
                    
            
            case "P":
            case "p":
                System.out.println("Do you want Pepsi (P or p),"+
                "Coke (C or c), Sprite (S or s) or Mountain Dew (M or m)");
        }
    }
}