/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//This program prompt the user to enter 10 ints and the program will 
//tell the user if there are duplicates in the numbers entered and if 
//there is exactly only one duplicate. The program calls two submethods in main method
//
//first compile the program
//      javac FindDuplicates.java
//run the program
//  java FindDuplicates
//

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int num[]){
    boolean duplicates=false;
    for(int j=0;j<num.length;j++){
      for(int k=j+1;k<num.length;k++){
        if (k!=j && num[k] == num[j]){
          duplicates=true;
        }
      }
    }
    return duplicates;
  }
  
  public static boolean exactlyOneDup(int num[]){
    boolean one=false;
    int count=0;
    for(int j=0;j<num.length;j++){
      for(int k=j+1;k<num.length;k++){
        if (k!=j && num[k] == num[j]){
          count++;
        }
      }
    }
    if(count==1){
          one=true;
    }
    else{
          one=false;
    }
    return one;
  }
  
}
