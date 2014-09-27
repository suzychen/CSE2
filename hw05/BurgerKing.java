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
        //create a scanner
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        //prompt the user to make a choice
        System.out.print(
            "Enter a letter to indication a choice of "+
            "Burger (B) or (b) "+
            "Soda (S) or (s) "+
            "Fries (F) or (f)");
        String choice=myScanner.next(); //get user's choice from scanner
        
        //set the condition that if the input is one character
        if (choice.length() == 1){
            //set the switch between the user's choice
            switch(choice){
                //when the user choose burger
                case "B":
                case "b":
                    //prompt the user to choose all fixins or cheese or none
                    System.out.print("Enter A or a for all the fixins "+
                    "C or c for cheese "+
                    "N or n for none of the above");
                    //get user's choice from the scanner
                    String choiceBurger=myScanner.next();
                    //set the condition that the user choose all the fixins
                    if (choiceBurger.equals ("A") || choiceBurger.equals ("a")){
                        //print out user's choice is a burger with all the fixins
                        System.out.println("You ordered a burger with all the fixins.");
                    }
                    //set the condition that the user choose cheese
                    else if (choiceBurger.equals ("C") || choiceBurger.equals ("c")){
                        //print out user's choice is a burger with cheese
                        System.out.println("You ordered a burger with cheese.");
                    }
                    //set the condition that the user choose none of them
                    else if (choiceBurger.equals ("N") || choiceBurger.equals ("n")){
                        //print out that the user just ordered a burger with nothing
                        System.out.println("You ordered a burger with none of the above.");
                    }
                    //the condition that the user did not choose any of (A or a), (C or c), (N or n)
                    else {
                        //prompt the user that the input is not legitimate
                        System.out.println("Your input is not legitimate.");
                    }
                    break;
                    
            
                //when the user choose a soda
                case "S":
                case "s":
                    //prompt the user to choose a brand of the soda
                    System.out.println("Do you want Pepsi (P or p),"+
                    "Coke (C or c), Sprite (S or s) or Mountain Dew (M or m)");
                    //get the user's choice from the scanner
                    String choiceBeverage=myScanner.next();
                    //the condition that the uer choose pepsi
                    if (choiceBeverage.equals("P") || choiceBeverage.equals("p")){
                        //print out the order
                        System.out.println("You ordered a Pepsi.");
                    }
                    //the condition that the user choose a coke
                    else if (choiceBeverage.equals("C") || choiceBeverage.equals("c")){
                        //print out the result
                        System.out.println("You ordered a Coke.");
                    }
                    //the condition that the user choose sprite
                    else if (choiceBeverage.equals("S") || choiceBeverage.equals("s")){
                        //print out the order
                        System.out.println("You ordered a Sprite.");
                    }
                    //the condition that the user choose montain dew
                    else if (choiceBeverage.equals("M") || choiceBeverage.equals("m")){
                        //print out the order
                        System.out.println("You ordered a Mountain Dew.");
                    }
                    //the condition that the user did not input any of (A or a), (S or s), (C or c) or (M or m)                    else {
                        //prompt the user the the input is not legitimate
                    else {    
                        System.out.println("Your input is not legitimate.");
                    }
                    break;
                //when the user choose fries
                case "F":
                case "f":
                    //prompt the user what size he/she wants to have
                    System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
                    //get the choice from the scanner
                    String choiceFries=myScanner.next();
                    //the condition that the user choose large fries
                    if (choiceFries.equals("L") || choiceFries.equals("l")){
                        //print out the result
                        System.out.println("You ordered large fries.");
                    }
                    //the condition that the user choose small fries
                    else if (choiceFries.equals("S") || choiceFries.equals("s")){
                        //print out the result
                        System.out.println("You ordered large fries.");
                    }
                    //the condition that the user did not input any of (L or l), (S or s)
                    else {
                        //prompt the user that the input is not legitimate
                        System.out.println("Your input is not legitimate.");
                    }
                    break;
                //when the user did not input the required character
                default: System.out.println("You did not enter any of (B or b), (F or f), or (S or s)");
            }
        }
        //the condition that the user did not input a single character
        else {
            System.out.println("a single character expected.");
        }
    }
}
