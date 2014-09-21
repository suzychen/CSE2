/////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//TimePadding Java Program
//This program prompts the user to enter an positive integer giving the
//number of seconds that have passed during the day and then displays the
//time in conventional form.

//  first compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding/
    import java.util.Scanner;
    
    //define a class
public class TimePadding{
    
    //my main method
    public static void main (String[] args){
        //create a scanner
        Scanner myScanner=new Scanner(System.in);
        
        //prompt the user to enter a integer giving the number of 
        //seconds that have passed
        System.out.print("Enter the number in seconds: ");
        //initialize the number as a integer and give the value from scanner to the number
        int number=myScanner.nextInt();
        int hours=(int)number/3600;
        int minutes=(int)((number-(hours*3600))/60);
        int secs=(int)(number-(hours*3600)-(minutes*60));
        
        if  (number > 0){
            if (minutes < 10 && secs < 10){
            System.out.println("The time is "+hours+":"+"0"+minutes+":"+"0"+secs);
        }
            else if (minutes < 10 && secs > 10){
            System.out.println("The time is "+hours+":"+"0"+minutes+":"+secs);
            }
            else if (minutes > 10 && secs < 10){
            System.out.println("The time is "+hours+":"+minutes+":"+"0"+secs);
            }
            else{
            System.out.println("The time is "+hours+":"+minutes+":"+secs);
            }
        }
        else {
            System.out.println("The number entered is positibe.");
        }
        
    }
}