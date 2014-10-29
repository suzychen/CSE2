//////////////////////////////
//Zijia Chen
//zic217
// This program has three different overloaded versions of getInput()
//It prompts the user whether to contiue and then enter Y/y/N/n to continue
//if the user entered wrong 5 times, the program prompts the user that he/she
//failed 5 times. And then the program asks the user to choose a number from 0 to 9
//and then print out the number chosen.
//
//
//first compile the program
//  javac hw08.java
//run the program
//  java hw08
//import a scnner
import java.util.Scanner;
//my class
public class HW8{
  //my main method
  public static void main(String []arg){
    char input;//initialize input as a char
    //create a scanner and get input from the scanner
    Scanner scan=new Scanner(System.in);
    //prompts the user
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    //a new method
    input=getInput(scan,"Cc");
    //prompts the user they choose to continue
    System.out.println("You entered '"+input+"'");
    
    //promtps the user to enter yes or no
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    //a new method
    input=getInput(scan,"yYnN",5); //give up after 5 attempts
    //the condition if the user didn't enter a space
    if(input!=' '){
       System.out.println("You entered '"+input+"'");//print out user's choice
    }
    //a new method
    input=getInput(scan,"Choose a digit.","0123456789");
    //print out the number the user chose
    System.out.println("You entered '"+input+"'");
    
  } 
  
  //define a new method
  public static char getInput(Scanner scan, String a){
      //initialize choice1 as a string from the scanner
      String choice1=scan.next();
      //initialize x as a char
      char x='a';
      
      //create the loop while the input's length is larger than 1
      while(choice1.length()>1){
        //prompts the user
        System.out.println("You should enter exactly one character- ");
        //get another value from scanner for choice1
        choice1=scan.next();
      }
      //create the loop while the input is not "C" or "c"
      while(!choice1.equals("C") && !choice1.equals("c")){
        //prompts the user
        System.out.println("You did not enter a character from the list 'Cc'");
        //get another value from scanner for choice1
        choice1=scan.next();
      }
      //the condition when the value of choice is "C" or "c"
      if (choice1.equals("C")|| choice1.equals("c")){
        //x is given by the value of first character of the input
        x=choice1.charAt(0);
      }
      //return the value of x to input
      return x;
  }
  
  //define a new method
  public static char getInput(Scanner scan, String b, int c){
      //initialize choice2 as a string from the scanner
      String choice2=scan.next();
      //initialize y as a char
      char y=' ';
      //initialize and declare i as 1
      int i=1;
      
      //create the loop when i is less than 5
      while (i<=5){
        //the condition when the input is legitimate
        if (choice2.equals("Y") || choice2.equals("y") ||choice2.equals("N") || choice2.equals("n")){
          //y is given the value of the first character of choice2
          y=choice2.charAt(0);
          break;//stop!
        }
        //the other condition that the length of choice2 is greater than one
        else if (choice2.length()>1){
          //prompts the user
          System.out.print("You should enter exactly one character- ");
          //increase i by 1
          i++;
          //get another input from scanner
          choice2=scan.next();
        }
        //the other condition 
        else{
          //prompts the user
          System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
          i++;//increase i by 1
          //get the new value for choice 2 from scanner
          choice2=scan.next();
        }
        //if i is five which means the user used up five tries
        if (i==5){
        //prompts the user
        System.out.println("You failed 5 times");
        break;//stop
        } 
      }
      
      return y;//return the value of y to input
  }
  
  //define a new method
  public static char getInput(Scanner scan, String d, String e){
    //prompts the user
    System.out.println(d);
    System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
    String choice3=scan.next();
    //initialize and declare z as a char
    char z=' ';
    
    //create the loop while the input is not an exactly one character
    while (choice3.length()!=1){
          //prompts the user to enter a new character
          System.out.println("You did not enter an exactly one character");
          System.out.println(d);
          System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
          choice3=scan.next();//get another input from scanner
    }
    //create the loop while the input is exactly one character
    while (choice3.length()==1){
      //when the input is legitimate within the range
      if(choice3.equals("0") || choice3.equals("1") || choice3.equals("2") 
      ||choice3.equals("3") || choice3.equals("4") || choice3.equals("5") || choice3.equals("6")
      || choice3.equals("7") || choice3.equals("8") || choice3.equals("9")){
        //get the input
        z=choice3.charAt(0);break;
      }
      //if not
      else{
        //prompts the user to enter another character
        System.out.println("You did not enter an acceptable character");
        System.out.println(d);
        System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
        choice3=scan.next();//get a new input from the scanner
      }
    }
    return z;//return the value of z to input
    
    
  }
  
  
  
  
  
}
