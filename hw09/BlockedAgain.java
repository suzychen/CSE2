///////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//This program call methods in main method and call subsubmethods in submethod
//to print out number stacks
//
//
//
//first compile the program
//  javac BlockedAgain.java
//run the program
//  java BlockedAgain

//import a scanner
import java.util.Scanner;
//my main class
public class BlockedAgain{
    //my main method
    public static void main(String []s){
        int m;
//force user to enter int in range 1-9, inclusive.
    //call method getInt()
    m = getInt();
    //call method allBlocks()
    allBlocks(m);
    }
    //define my submethod getInt()
    public static int getInt() {
        //declare and initialize n as zero
        int n=0;
        //prompts the user to enter an int between 1 and 9
        System.out.print("Enter an int between 1 and 9, inclusive ");
        //call submethods to check the if the input is an int and if it is within the range
        n=checkRange(checkInt());
        // get the int to main method
        return n;
    }
    
    //define subsubmethod under getInt()
    public static int checkInt(){
		//declare and initialize y as zero
		int y=0;
		//create a scanner and get input from the scanner
		Scanner scan=new Scanner (System.in);
		//the condition if the input is an int
		if (scan.hasNextInt()){
		    //y equals the value of the input
		    y=scan.nextInt();
		}
		//otherwise
		else{
		    //the loop when the input is not an int
		    while (!scan.hasNextInt()){
		    //prompts the user to enter again
		    System.out.print("You did not enter an int; try again: ");
		    //get another input from scanner
		    scan.next();
		    }
		    //until the input is an int, y gets the value of the input
		    y=scan.nextInt();
		}
		//return the value of y to method getInt()
		return y;
    }
    
    //define a submethod under getInt()
    public static int checkRange(int x){
        //create a scanner and get input from the scanner
        Scanner scan=new Scanner(System.in);
        //initialize and declare z as x
        int z=x;
        //the condition when z is within the range
        if (z>=1 && z<=9){
            //return z to method getInt()
            return z;
        }
        //otherwise
        else{
            //the loop when z is out of range
            while (z<=1 || z>=9){
                //prompt the user and force him/her to enter again
                System.out.print("You did not enter an int in [1,9]; try again: ");
                 //get the new value for z from the scanner
                 z=scan.nextInt();
            }
        }
        //return the value of z to method getInt()
        return z;
    }
       
    
    //define another submethod allBlocks()
    public static void allBlocks(int y){
        //create loop for print out until i equals the value of number entered
        for (int i=1;i<=y;i++){
            //call two subsubmethods
            block(i);
            line(i);
            //start a new line
            System.out.print("\n");
        }
    }
    
    //define a subsubmethod under method allBlocks()
    public static void block(int i){
            //create the loop for print out blocks
            for (int j=0;j<i;j++){
                //control the space before the number
                for (int k=0;k<(9-i);k++){
                    System.out.print(" ");//print out space
                }
                //control the times of the number got printed; the times is two times the number entered minus one
                for (int k=0; k<2*i-1;k++){
                    System.out.print(i);//print out numbers and number of times as required
                }
            System.out.print("\n");//start a new line
            }
         
    }
    
    //define a subsubmethod under method allBlocks()
    public static void line (int i){
            //create the loop for print out lines
            for (int l=0;l<(9-i);l++){
                 System.out.print(" ");//print out spaces
            }
            for (int l=0; l<2*i-1;l++){
                System.out.print("-");//print out hyphens
            }
            //System.out.print("\n");//start a new line
            
        
        
    }
    
}