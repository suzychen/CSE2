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
        int hours=(int)number/3600; //initialize hour and compute hours from the seconds entered
        int minutes=(int)((number-(hours*3600))/60); //initialize minute and compute minutes from the seconds entered
        int secs=(int)(number-(hours*3600)-(minutes*60)); //initialize second and compute seconds from the seconds entered
        
        //set the condition that the seconds entered is a positive number
        if  (number > 0){
            //set the condition that is minutes and seconds are one-decimal numbers
            if (minutes < 10 && secs < 10){
            //print out the padded time form with 0 in front of minutes and seconds
            System.out.println("The time is "+hours+":"+"0"+minutes+":"+"0"+secs);
        }
            //set the condition that if minutes is a one-decimal number and second is a two-decimal number
            else if (minutes < 10 && secs > 10){
            //print out the padded time form with 0 in front of minutes
            System.out.println("The time is "+hours+":"+"0"+minutes+":"+secs);
            }
            //set the condition that if minutes is a two-decimal number and seconds is a one-decimal number
            else if (minutes > 10 && secs < 10){
            //print out the padded time form with 0 in front of seconds
            System.out.println("The time is "+hours+":"+minutes+":"+"0"+secs);
            }
            //the condition that both minutes and seconds are two-decimal numbers
            else{
            System.out.println("The time is "+hours+":"+minutes+":"+secs);
            }
        }
        //the conditin that the number entered is not a positive number
        else {
            System.out.println("The number entered is not positive.");
        }
        
    }
}