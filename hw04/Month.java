///////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//Month Java Program
//This program prompts the user to enter an integer for the month 
//(1 for January, 2 for February, etc.)  and then displays the number 
//of days in the month. If the number 2 is entered (February) the user is 
//then asked to enter the year.

//  first compile the program
//      javac Month.java
//  run the program
//      java Month

    import java.util.Scanner;

//define a class 
public class Month{
    
    //my main method
    public static void main (String[] args) {
        //create a scanner
        Scanner myScanner=new Scanner (System.in);
        //prompt the user to enter an integer for the month
        System.out.print("Enter an int giving the number of the month (1-12) ");
        //initialize the number of days in a month
        
        if (myScanner.hasNextInt()){
            int month=myScanner.nextInt(); //declare the input an integer
            if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                System.out.println("The month has 31 days.");
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("The month has 30 days.");
            }
            else if (month == 2){
                System.out.print("Enter an int giving the year ");
                int year=myScanner.nextInt();
                if (year%4 == 0){
                    System.out.println("The month has 29 days.");
                }
                else {
                    System.out.println("The month has 28 days.");
                }
            }
            else {
                System.out.println("You did not enter an int between 1 and 12.");
                return;
            }
        }
        else{
            System.out.println("You did not enter an integer.");
            return;
        }
    }
}