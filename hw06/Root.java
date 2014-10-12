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

import java.util.Scanner;
public class Root{
        public static void main (String[] args){
            Scanner myScanner=new Scanner(System.in);
            System.out.print("Enter a double that is greater than 0- " );
            double num=myScanner.nextDouble();
            double i=num;
            double low=0.0;
            double high=1+i;
            
            double middle=0.0;
            while((high-low) > 0.0000001*(1+num)){
                middle=(low+high)/2;
                if(middle*middle>num){
                    high=middle;
                }
                else if (middle*middle<num){
                    low=middle;
                }
            }
            System.out.println("The square root is "+middle);
            
        }
}