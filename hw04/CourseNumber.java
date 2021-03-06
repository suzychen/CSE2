/////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//CourseNumber Java Program
//This program prompts the user to enter course number and prints out the semester
//and year which the course is taken.

//  first compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber
    import java.util.Scanner;
    
    //define a class
public class CourseNumber{
    
    //my main method
    public static void main (String[] args) {
        //create a scanner
        Scanner myScanner=new Scanner(System.in);
        
        //prompt the user to enter the course number (an integer)
        System.out.print("Enter a six digit number giving the course semester-");
        
        //initialize the input as an integer and declare number as the value of the input
        int number=myScanner.nextInt(); 
        //get the first four digits of the number entered
        int firstFourDigits=(int)(number/100);
        //get the last two digits of the number entered 
        int lastTwoDigtits=number-((int)(number/100)*100);
        
        //set the condition that the year (first four digits) must be within 189410 and 201440
        if (firstFourDigits >= 186410 || firstFourDigits <= 201440){
            //set the condition that if  the last two digits is 10
            if (lastTwoDigtits == 10){
                System.out.println("The course was offered in spring semester of "+firstFourDigits);
            }
            //set the condition that if  the last two digits is 20
            else if (lastTwoDigtits == 20){
                System.out.println("The course was offered in summer 1 semester of "+firstFourDigits);
            }
            //set the condition that if  the last two digits is 30
            else if (lastTwoDigtits == 30){
                System.out.println("The course was offered in summer 2 semester of "+firstFourDigits);
            }
            //set the condition that if  the last two digits is 40
            else if (lastTwoDigtits ==40){
                System.out.println("The course was offered in fall semester of "+firstFourDigits);
            }
            // the condition that if the last two digits are not 10 or 20 or 30 or 40
            else {
                System.out.println(lastTwoDigtits+" is not a legitimated semester.");
            }
        }
        // the condition that the number is outside of the range
        else{
            System.out.println("The number was outside the range [186510,201440].");
        }
    }
}