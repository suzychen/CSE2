////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//IncomeTax Java Program
//This program prompts the user to enter an int that gives the thousands of
//dollars of income and then writes out the amount of tax on the income.
//
//  first compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax/

    import java.util.Scanner;
//define a class
public class IncomeTax{
    
    //my main method
    public static void main (String[] args) {
        //create a scanner
        Scanner myScanner=new Scanner(System.in);
        
        //prompt the user to enter income in thousand
        System.out.print("Enter an int giving the number of thousands- ");
        
        //comput tax
        double tax=0;
        
        if (myScanner.hasNextInt()){
            int income=myScanner.nextInt(); //declare the input a int
            if (income < 0){
                 System.out.println("You did not enter a positive integer.");//prompt the user that the input is not a positive integer
            }
            else if(income < 20){
                tax=income*1000*0.05; //compute the tax when tax rate is 0.05
                System.out.println("The tax rate on $"+income*1000+" is 5% and the tax is $ "+(int)(tax*100)/100.0);
            } ////print out tax rate and tax
            else if (income < 40){
                tax=income*1000*0.07; //compute the tax when tax rate is 0.07
                System.out.println("The tax rate on $"+income*1000+" is 7% and the tax is $ "+(int)(tax*100)/100.0);
            } //print out tax rate and tax
            else if (income < 78){
                tax=income*1000*0.12; //compute the tax when tax rate is 0.12
                System.out.println("The tax rate on $"+income*1000+" is 12% and the tax is $ "+(int)(tax*100)/100);
            }
            else {
                tax=income*1000*0.14;  //compute the tax when tax rate is 0.14
                System.out.println("The tax rate on $"+income*1000+" is 14% and the tax is $ "+(int)(tax*100)/100);
            }//print out tax rate and tax
        
        }
        else{
            System.out.println("You did not enter an integer."); //prompt the user that the input is not an integer
            return; 
        }
        
        
        
    }
}