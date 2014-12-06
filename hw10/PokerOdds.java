/////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//The program contains two submethods under the main method.The method 
//showOneHand() generate random poker hands, prompting the user 
//if they would like another hand to be generated. The method simulateOdds()
//randomly generate 10000 hands and count the number of times that a hand with 
//a pair of a specific rank occurs, along with the number of hands that do not
//have a pair.
//
//first compile the program
//  javac PokerOdds.java
//run the program
//  java PoderOdds

//create random and scanner
import java.util.Random;
import java.util.Scanner;
//my class
public class PokerOdds{
  //my main method
  public static void main(String [] arg){
    //call two submethod
    showHands();
    simulateOdds();
  }
  
  
  //define a new submethod showHands()
  public static void showHands(){
      //create a scanner
      Scanner scan=new Scanner(System.in);
      //declare answer as a string
      String answer="";
      //declare an array suit
      String[] suit={"Diamonds","Spades","Clubs","Hearts"};
      //define a new array rank
      String[] rank={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
      //create a do-while loop
      do{
        //create a generate for random number
        Random number=new Random();
        //create an array hand
        int[] hand={-1,-1,-1,-1,-1};
        //create an array whuich contains 52 values
        int[] deck=new int[52];
        //create a for loop for giving value to array deck[]
        for(int j=0;j<deck.length;j++){
          deck[j]=j;
        }
        //create a for loop for "swap" value between array hand[] and array deck[]
        for (int i=0;i<hand.length;i++){
            int ind=number.nextInt(52);
            hand[i]=deck[ind];
            deck[ind]=deck[51-i];
            deck[51-i]=-1;
        }
        //set Clubs, Diamonds, Hearts and Spades as strings
        String Clubs="Clubs: ";
        String Diamonds="Diamonds: ";
        String Hearts="Hearts: ";
        String Spades="Spades: ";
        //create for-loop to find value in the random generated numbers
        for (int k=0;k<5;k++){
          //convert them into strings
          String s=suit[hand[k]/13];
          String r=rank[hand[k]%13];
          //categorized the value into different suit
          if(s.equals("Clubs")){
            Clubs+=r+" ";
          }
          if(s.equals("Diamonds")){
            Diamonds+=r+" ";
          }
          if(s.equals("Hearts")){
            Hearts+=r+" ";
          }
          if(s.equals("Spades")){
            Spades+=r+" ";
          }
        }
        //print out
        System.out.println(Clubs);
        System.out.println(Diamonds);
        System.out.println(Hearts);
        System.out.println(Spades);
        //prompts the user if to go again 
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
      }
    
    //define another new submethod simulateOdds()
    public static void simulateOdds(){
      //declare muptiple variables
      int a=0;
      int ace=0;
      int two=0;
      int three=0;
      int four=0;
      int five=0;
      int six=0;
      int seven=0;
      int eight=0;
      int nine=0;
      int ten=0;
      int joker=0;
      int queen=0;
      int king=0;
      int t=0;
      int Rank[]={0,0,0,0,0};//create an array Rank
      int[] deck=new int[52]; //create an array deck
      do{
      //create a random number generator
      Random number=new Random();
      //create an array hand
        int[] hand=new int[5];
        //give value to the array
        hand[0]=-1;
        hand[1]=-1;
        hand[2]=-1;
        hand[3]=-1;
        hand[4]=-1;
        
        //set value to array deck[]
        for(int j=0;j<deck.length;j++){
          deck[j]=j;
        }
        //set value and "swap" the value between hand and deck
        for (int i=0;i<hand.length;i++){
            int ind=number.nextInt(52);
            hand[i]=deck[ind];
            deck[ind]=deck[51-i];
            deck[51-i]=-1;
        }
        //set value to array Rank[]
        for (int i=0;i<5;i++){
          Rank[i]=hand[i]%13;
        }
        //check if there is only exactly one duplicate in the array by using if-loop
        if (FindDuplicates.exactlyOneDup(Rank)){
          //create for-loop for check the five values
          for(int i=0;i<5;i++){
            //check one-by-one
            
            for (int j=i+1;j<5-i;j++){
                if(Rank[j]==Rank[i]){
                switch (Rank[i]){
                  case 0:ace+=1;
                    break;
                  case 1:two+=1;
                    break;
                  case 2:three+=1;
                    break;
                  case 3:four+=1;
                    break;
                  case 4:five+=1;
                    break;
                  case 5:six+=1;
                    break;
                  case 6:seven+=1;
                    break;
                  case 7:eight+=1;
                    break;
                  case 8:nine+=1;
                    break;
                  case 9:ten+=1;
                    break;
                  case 10:joker+=1;
                    break;
                  case 11:queen+=1;
                    break;
                  case 12:king+=1;
                    break;
              }//switch
              
              }//if
            
            /*if(Rank[i-1]==Rank[i]){
            switch (Rank[i]){
              case 0:ace+=1;
                break;
              case 1:two+=1;
                break;
              case 2:three+=1;
                break;
              case 3:four+=1;
                break;
              case 4:five+=1;
                break;
              case 5:six+=1;
                break;
              case 6:seven+=1;
                break;
              case 7:eight+=1;
                break;
              case 8:nine+=1;
                break;
              case 9:ten+=1;
                break;
              case 10:joker+=1;
                break;
              case 11:queen+=1;
                break;
              case 12:king+=1;
                break;
            }
          }*/
        }//for
        }//for
      }
      else{
           t+=1;
      }
        a++;
      }while(a<10000); //do 10000 times
      //print out the result
      System.out.println("A: "+ace);
      System.out.println("2: "+two);
      System.out.println("3: "+three);
      System.out.println("4: "+four);
      System.out.println("5: "+five);
      System.out.println("6: "+six);
      System.out.println("7: "+seven);
      System.out.println("8: "+eight);
      System.out.println("9: "+nine);
      System.out.println("10: "+ten);
      System.out.println("J: "+joker);
      System.out.println("Q: "+queen);
      System.out.println("K: "+king);
      System.out.println("Total of not exactly one pair: "+t);
    }
    
    
    
    
  }
  
  
