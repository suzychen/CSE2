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
        
        //set the condition that if the next input is a integer
        if (myScanner.hasNextInt()){
            int income=myScanner.nextInt(); //get the input from scanner and declare the input a int
            //set the condition that if the income entered is not a postive number
            if (income < 0){
                 System.out.println("You did not enter a positive integer.");//prompt the user that the input is not a positive integer
            }
            //set the condition that if income is less than 20 thousands
            else if(income < 20){
                tax=income*1000*0.05; //compute the tax when tax rate is 0.05
                 //print out tax rate and tax
                System.out.println("The tax rate on $"+income*1000+" is 5% and the tax is $ "+(int)(tax*100)/100.0);
            }
            //set the condidion that if income is less than 40 thousands
            else if (income < 40){
                tax=income*1000*0.07; //compute the tax when tax rate is 0.07
                //print out tax rate and tax
                System.out.println("The tax rate on $"+income*1000+" is 7% and the tax is $ "+(int)(tax*100)/100.0);
            } 
            //set the condition that if income is less than 78
            else if (income < 78){
                tax=income*1000*0.12; //compute the tax when tax rate is 0.12
                //print out tax rate and tax
                System.out.println("The tax rate on $"+income*1000+" is 12% and the tax is $ "+(int)(tax*100)/100);
            }
            //set the condition that if none of the conditions above is satisfied
            else {
                tax=income*1000*0.14;  //compute the tax when tax rate is 0.14
                System.out.println("The tax rate on $"+income*1000+" is 14% and the tax is $ "+(int)(tax*100)/100);
            }//print out tax rate and tax
        
        }
        //the condition that the input is not an integer
        else{
            System.out.println("You did not enter an integer."); //prompt the user that the input is not an integer
            return; 
        }
        
        
        
    }
}