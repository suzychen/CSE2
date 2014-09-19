/////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//BigMacAgain Java Program
//This program obtains input from user how many Big macs they want and whether
//they want an order or fries, and then prints out the total cost of the meal

//  first compile the program
//      javac BigMacAgain.java
//  run the program
//       java BigMacAgain//
        import java.util.Scanner;
        
public class BigMacAgain{
    //my main method
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.println(
            "Enter the number of Big Macs: "); //prompt the user to enter the number of Big mac they want
        int bigMac=myScanner.nextInt();
        double bigMacCost$;
        double totalCost$;
        bigMacCost$=2.22*bigMac;
        totalCost$=bigMacCost$+2.15;
        
        if (myScanner.hasNextInt())
        {   int number=myScanner.nextInt();
            bigMac=number;
            if (bigMac >= 0 ) 
            {
            System.out.println("You ordered "+bigMac+" Big Macs for a cost of "+bigMacCost$+" dollars");
        }
            else{
            System.out.println("You did not enter an int>0");
            return;}//the program terminates}
        }
        else{
            System.out.println("You did not enter an integer");
            return;} //the program terminates
        
        System.out.print("Do you want an order of fries (Y/y/N/n)?");
        String fries=myScanner.next();
        if (fries.equals("Y") && fries.equals("y")){
            System.out.println("You ordered fries at a cost of 2.15 dollars.");
            System.out.println("The total cost of the meal is "+totalCost$);
        }
        else if (fries.equals("N") && fries.equals("n")){
           bigMacCost$=2.22*bigMac;
            System.out.println("The total cost of the meal is "+bigMacCost$);
        }
        else {
            System.out.println("Your input cannot be recognized.");
        }
    }
}
            
 
    
