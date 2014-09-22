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
        
        //set the condition that the next input scanner gets is an int
        if (myScanner.hasNextInt()){
            int month=myScanner.nextInt(); //declare the input an integer
            //set the condition that if it is January, March, May, July, August, October or December
            if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                //print out that there are 31 days in that month
                System.out.println("The month has 31 days.");
            }
            //set the condition that if it is April, June, September or November
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                //print out that there are 30 days in that month
                System.out.println("The month has 30 days.");
            }
            //set the condition that if it is February
            else if (month == 2){
                //prompt the user to enter the year
                System.out.print("Enter an int giving the year ");
                //declare the input from the scanner an int
                int year=myScanner.nextInt();
                //to see if the year entered is a lunar year (if the int giving the year can be divided by 4)
                //if yes
                if (year%4 == 0){
                    //print out that there are 29 days in February when it is lunar year
                    System.out.println("The month has 29 days.");
                }
                //if not
                else {
                    //print out that there are 28 days
                    System.out.println("The month has 28 days.");
                }
            }
            //the condition that the int giving month is outside of rage 1 to 12
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