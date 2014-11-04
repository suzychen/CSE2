/////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//LoopTheLoop Java Program
//This 


import java.util.Scanner;

public class LoopTheLoop{
    public static void main (String[] args){
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        //System.out.print("Enter an int between 1 and 15- ");
        int nStar=-1;
        while (nStar < 1 || nStar > 15) {
            System.out.print("Enter an int between 1 and 15(1) - ");
            //nStar=myScanner.nextInt();
        

            while (myScanner.hasNextInt()==false) {
                if (myScanner.hasNextInt()){
                    nStar=myScanner.nextInt();
                    break;
                }
                else{
                    System.out.println("Enter an int between 1 and 15(2)- ");
                    nStar=myScanner.nextInt();
                    break;
                }
            }   
            nStar=myScanner.nextInt();
            
        }
        
        int counter=0;
        while (counter < nStar){
            counter++;
            System.out.print("*");
        }
            
        int k=0;
        while (k <= nStar) {
            int times=k;
            while (times != 0) {
                System.out.print("*");
                times--;
            }
            System.out.print("\n");
            k++;
        }
        
    }
}