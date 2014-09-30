///////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic127
//BoolaBoola Java Program
//The  program has three boolean variables to each of which the value of true 
//or false is randomly assigned with random choices of && and ||. The program
// then present the expression to the user and ask the user to state the result 
//of of the expression.

//  first compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola
    import java.util.Scanner;
    
//define a class
public class BoolaBoola{
    //my method
    public static void main(String[] args){
        //create a  scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        boolean num1=true; //declare num1 as a boolean and initialize it as true
        boolean num2=true;  //declare num2 as a boolean and initialize it as true
        boolean num3=true;  //declare num3 as a boolean and initialize it as true
        boolean logic=true;  //declare logic as a boolean and initialize it as true
        String A=" ";  //declare A as a string and initialize it 
        String O=" ";  //declare O as a string and initialize it
        
        //declare a, b, c, as int and get them randomly between 0 to 1 
        int a=(int)(Math.random()*2);
        int b=(int)(Math.random()*2);
        int c=(int)(Math.random()*2);
        //declare d as an int and get it randomly from 0 to 3
        int d=(int)(Math.random()*4);
        
        //divide a by 2 to see the remainder 
        switch (a%2){
            case 0: num1=true; break; //if the remainder is 0, num1 is intialized as true
            case 1: num1=false; break; //if the remainder is 1, number is intialized as false
        }
        //divide b by 2 to see the remainder
        switch (b%2){
            case 0:num2=true; break; //if the remainder is 0, num2 is intialized as true
            case 1:num2=false; break; //if the remainder is 0, num2 is intialized as true
        }
        //divide c by 2 to see the remainder
        switch (c%2){
            case 0:num3=true; break; //if the remainder is 0, num3 is intialized as true
            case 1:num3=false; break; //if the remainder is 0, num3 is intialized as true
        }
        //divide d by 4 to see the remainder
        switch (d%4){
            case 0: logic=num1&&num2&&num3; //if the remainder is 0, re-intialize logic as
                    A="&&"; //A becomes &&
                    O="&&"; //O becomes &&
                    break;
            case 1: logic=num1&&num2||num3; //if the remainder is 1, re-intialize logic as
                    A="&&"; //A becomes &&
                    O="||"; //O becomes ||
                     break;
            case 2: logic=num1||num2&&num3; //if the remainder is 2, re-intialize logic as
                    A="||"; //A becomes ||
                    O="&&"; //O becomes &&
                    break;
                     
            case 3: logic=num1||num2||num3;  //if the remainder is 2, re-intialize logic as
                    A="||";  //A becomes ||
                    O="||";  //O becomes ||
                    break;
        }
        //prompt the user to enter the guess of the logic operation result
        System.out.print("Does "+num1+" "+A+" "+num2+" "+O+" "+num3+" have the value ture(t/T) or false(f/F)?");
        //take user's input from the scanner
        String answer=myScanner.next();
        //if the user enter T or t
        if (answer.equals("T") || answer.equals("t")){
            //declare and initialize test (the complete answer of (T or t)) as true
            boolean test=true;
            //if the answer is the same as the outcome of logic operation
            if (test == logic){
                //prompt the user that he/she is right
                System.out.println("Correct");
            }
            //prompt the user that he/she is wrong
            else {
                System.out.println("Wrong. Try again");
            }
        }
        //if the user enter F or f
        else if (answer.equals("F") || answer.equals("f")){
            //declare and initialize test (the complete answer of (F or f)) as false
            boolean test=false;
            //if the answer is the same as the outcome of logic operation
            if (test == logic){
                //prompt the user that he/she is right
                System.out.println("Correct");
            }
            else {
                //prompt the user that he/she is wrong
                System.out.println("Wrong. Try again");
            }
        }
        //if the user did not enter either T or t or F or f
        else {
            //prompt the user that he/she is wrong
            System.out.println("Wrong. Try again");
        }
        
    }
}