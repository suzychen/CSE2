///////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//Root Java Program
//This program prompts the user to enter a double and then
//prints out a crude estimate of the cube root of the number and the value of 
//the crude guess when cubed

//  first compile the program
//      javac Root.java
//  run the program
//      java Root//
        import java.util.Scanner;
        
//my class
public class Root {
    //my main method
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in); //allow next input to enter
        System.out.print(
            "Enter a double, and I print out its cube root: "); //prompt out the user to print a double
            double number=myScanner.nextDouble();
            //declare that the number entered should be a double
            
        double sqrt=number/3; //guessing the square root of the number entered
        double guess1=(2*sqrt*sqrt*sqrt+number)/(3*sqrt*sqrt);
        //guess the cube root of the number entered is(guess*guess*guess+x)/(3*guess*guess)
        double guess2=(2*guess1*guess1*guess1+number)/(3*guess1*guess1);
        double guess3=(2*guess2*guess2*guess2+number)/(3*guess2*guess2);
        double guess4=(2*guess3*guess3*guess3+number)/(3*guess3*guess3);
        double guess5=(2*guess4*guess4*guess4+number)/(3*guess4*guess4);
        double guess6=(2*guess5*guess5*guess5+number)/(3*guess5*guess5);
        //above improves the crude estimate cube root of the number entered by 
        //coding the substition
        
        System.out.print(
            "The cube root is "+guess6+".");
        System.out.print(
            " Cube of the crude guess is "+guess6*guess6*guess6);
        
    }
}