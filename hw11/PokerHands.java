//////////////////////////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//This program prompts the user to input five card poker hand,
//the program will then print out the hand and the rank of the hand

//import scanner and array
import java.util.Scanner;
import java.util.Arrays;
//my class
public class PokerHands{
    //my main method
    public static void main(String [] arg){
        //create a scanner
        Scanner scan=new Scanner(System.in);
        //define suit as a string
        String suit="";
        //define answer as a string
        String answer="";
        //define and initialize rank as 0
        int rank=0;
        //create an array called hand which has five elements
        int hand []=new int [5];
        //create an array called ranks which has thirteen elements, this array is used to count times each number(o to 13) shows up 
        int ranks []=new int [13];
        //create an array called frequency which as five elements
        int frequency []=new int [5];
        //initialize r as 0
        int r=0;
        //create a loop, fill the array ranks with zero
        for (int i=0;i<13;i++){
            ranks[i]=0;
        }
        //create a loop, fill the array frequency with zero
        for (int i=0;i<5;i++){
            frequency[i]=0;
        }
        //a do-while loop
        do{
            //create a loop
        for (int i=0;i<5;i++){
            //prompts the user to enter a suit
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
            //get input from scanner
            suit=scan.next();
            //if the input is not among required ones, prompts the user
            while (!suit.equals("c")&&!suit.equals("d")&&!suit.equals("h")&&!suit.equals("s")){
                System.out.println("You did not enter a valid response");
                //and user enter again
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                suit=scan.next();//get input from the scanner
            }
            //prompts the user to enter a number
            System.out.print("Enter one of '14', '13', 12', '11', '10', ...'2'(14 for Ace)- ");
            //get the int from the scanner
            rank=scan.nextInt();
            //check what suit is enter
            if(suit.equals("c")){
                //modify the number entered to number we will use in the program
                hand[i]=rank-2;
            }
            if(suit.equals("d")){
                hand[i]=rank+13-2;
            }
            if(suit.equals("h")){
                hand[i]=rank+26-2;
            }
            if(suit.equals("s")){
                hand[i]=rank+39-2;
            }
            //r is the value of number on card
            r=hand[i]%13;
            //mark that we have r once
            ranks[r]+=1;
        }
            //fill array frequency 
            for (int i=0;i<13;i++){
                switch(ranks[i]){
                    case 0: frequency[0]+=1;break;
                    case 1: frequency[1]+=1;break;
                    case 2: frequency[2]+=1;break;
                    case 3: frequency[3]+=1;break;
                    case 4: frequency[4]+=1;break;
                }
            }
        //calls showOneHand method
        showOneHand(hand);
        //if the hand is royal
        if (royal(hand)){
            //print out royal
            System.out.print("royal ");
        }
        //if the hand is straight
        if (straight(hand)){
            //print out straight
            System.out.print("straight ");
        }
        //if the hand is flush
        if (flush(hand)){
            //print out flush
            System.out.print("flush ");
        }
        //check the rank of the hand other than royal, straight and flush
        repeat(frequency,hand);
        System.out.println();
        //prompt the user if want to go again
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();//get user's anwer
      }while(answer.equals("Y")||answer.equals("y"));
        
        
    }
    //create submethod showOneHand
    public static void showOneHand(int hand[]){
        //define and initialize array suit
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",  "Spades:   "};
	//define and initialize array face
	String face[]={"2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ",
  	"J ","Q ","K ","A "};
  	//define out as a string
	String out="";
	//create a loop to fill out with the four suits
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	//create a loop to run 13 times
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
  
  //create a submethod called straight
  public static boolean straight(int hand[]){
     //create a new array which has five elements
      int array []=new int [5];
      //create a loop
      for (int i=0;i<5;i++){
          //give the face value of the card to the array
          array[i]=hand[i]%13;
      }
      //sort the array
      Arrays.sort(array);
      //check if the hand is a straight
      if (array[0]+1==array[1]&&array[1]+1==array[2]&&array[2]+1==array[3]&&array[3]+1==array[4]){
          return true;
      }
      //if not, return false
      else {
          return false;
      }
  }
  
  //create a submethod called flush
  public static boolean flush(int hand[]){
      //create a new array which has five elements
      int array []=new int [5];
      //create a loop, fill the suite a the hand
      for (int i=0;i<5;i++){
          array[i]=hand[i]/13;
      }
      //check if the five cards all have the same suit
      if (array[0]==array[1]&&array[1]==array[2]&&array[2]==array[3]&&array[3]==array[4]){
          return true;
      }
      //if not return false
      else {
          return false;
      }
  }
  
  //create submethod to check if the hand is a royal
  public static boolean royal(int hand[]){
      //create a new array which has five elements
      int array []=new int [5];
      //create a loop to assign the face value of hand to the new array
      for (int i=0;i<5;i++){
          array[i]=hand[i]%13;
      }
      //sort the new array
      Arrays.sort(array);
      //check if they are royal rank
      if (array[0]==8&&array[1]==9&&array[2]==10&&array[3]==11&&array[4]==12){
          return true;
      }
      //if not, return false
      else {
          return false;
      }
  }
  
  //create submethod to check which the hand belongs to other than royal, straight or flush
  public static void repeat(int frequency[],int hand[]){
      //the the hand has four same numbers
      if (frequency[4]==1){
          //print out four of a king
          System.out.print("Four of a Kind");
      }
      //if the hand has two pairs
      if (frequency[2]==2){
          //print out two pairs
          System.out.print("Two Pair");
      }
      //if the hand has one pair and three same numbers
      if (frequency[2]==1&&frequency[3]==1){
          System.out.print("Full House");
      }
      //if the hand has one pair and three different numbers
      if (frequency[2]==1&&frequency[3]!=1){
          System.out.print("One Pair");
      }
      //if there are five different numbers
      if (frequency[1]==5&&!straight(hand)&&!flush(hand)){
          System.out.print("High Card");
      }
  }
}