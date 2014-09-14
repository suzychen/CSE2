////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//FourDigits Java Program
//This program prompts the user to enter a double and  then prints out the 
//first four digits to the right of the decimal point

//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//
        import java.util.Scanner;
        
//define a class
public class FourDigits{
    //my main method
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);//allow next input to enter
        System.out.print(
            "Enter a double and I display the four digits to the right of the decimal point: ");
            //prompts the user to enter a double
            double originalNumber=myScanner.nextDouble();
            //declare that the number entered should be a double
        
        int number1=(int)(originalNumber*10000); //multiply the number entered by 10000 to make it an integer
        int number2=(int)originalNumber; //declare that number2 is the integer part of the number entered
        int number3=number2*10000; //multiply the integer by 10000
        int lastDigit=number1%10; //to get additional digit, divided by 10 and get the remaining digit
        int lastSecondDigit=number1/10%10;
        //repeat the previous step,divided by 10 and repeat
        //to get the last second digit, which is the remaining number
        int lastThirdDigit=number1/100%10;
        //divide the number by 100
        //and repeat to divide by 10 to get the last third digit, which is the remaining number
        int lastFourthDigit=number1/1000%10;
        //divide the number by 1000
        //and repeat to divide by 10 to get the last fourth digit, which is the remaining number
        
        
        System.out.print(
            "The four digits are: "+lastFourthDigit+lastThirdDigit+lastSecondDigit+lastDigit);
            
        //test/testtest
    }
}