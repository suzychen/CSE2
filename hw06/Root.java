//////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//This program prompts the user to enter a double that is greater than 0,
//and use bisection method to compute the square root of the number
//
//first comppile the program
//  javac Root.java 
//run the program
//  java Root

//import a scanner
import java.util.Scanner;
//my class
public class Root{
        //my main method
        public static void main (String[] args){
            //create a scanner and get the value of myScanner from Scanner
            Scanner myScanner=new Scanner(System.in);
            //prompt the user to enter a double
            System.out.print("Enter a double that is greater than 0- " );
            //initialize and declare num as the value get from user input
            double num=myScanner.nextDouble();
            //initialize  and declare i as the value of num
            double i=num;
            //initialize and declare lower limit is zero
            double low=0.0;
            //initialize and declare upper limit is user's number plus 1
            double high=1+i;
            
            //initialize and declare middle 
            double middle=0.0;
            //set up the loop, the condition is when the difference between upper limit and lower limit is greater than
            //0.0000001 tolerance of user number plus 1
            while((high-low) > 0.0000001*(1+num)){
                //middle is half of the sum of upper and lower limit
                middle=(low+high)/2;
                //the condition that when square of middle is greater than user's number
                if(middle*middle>num){
                    //if satisfy, upper limit becomes middle 
                    high=middle;
                }
                //if not
                else if (middle*middle<num){
                    //lower limit becomes middle
                    low=middle;
                }
            }
            //print out the squre root
            System.out.println("The square root is "+middle);
            
        }
}