//////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//Bicycle Java Program
//This program calculates the distance traveled and the average miles per hour 
//by prompting the user to enter the number of counts on a cyclometer and
//the seconds during which the counts occurred
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//
        import java.util.Scanner;

//  define a class
public class Bicycle{
    //main method required for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.print(
            "Enter the number of seconds (an integer > 0): ");
            //prompt the user to enter the seconds
            int secs=myScanner.nextInt(); 
            //declare the seconds entered should be an integer
        System.out.print(
            "Enter the number of counts (an integer > 0): ");
            //prompt the user to enter the counts
            int counts=myScanner.nextInt();
            //declare the counts entered should be an integer
        double wheelDiameter=27.0,//declare the diameter of a wheel
        PI=3.14159, //This gives the approximate numerical value for PI
        feetPerMile=5280,   //This gives value for feet per mile
        inchesPerFoot=12,   //This gives value for inches per foot
        secondsPerMinute=60;    //This gives value for seconds per minute
        
        double distance=((int)(counts*wheelDiameter*PI*100/inchesPerFoot/feetPerMile))/100.0;
        //Above first gives distance in inches
        //(for each count, a rotation of the wheel travel
        //the diameter in inches times PI)
        //and then convert the distance in mile
        double distanceOriginal=(counts*wheelDiameter*PI)/inchesPerFoot/feetPerMile;
        //above gives the original value of distance which has more digits for
        //for the calculation for average mph
        double time=secs/secondsPerMinute; //convert time in minutes
        double averageMph=((int)((distanceOriginal*100)/(time/60)))/100.0;
        //calculates average miles per hour
        
        System.out.print("The distance was "+distance+" miles and took "
            +time+" minutes.");
        System.out.print("The average mph was "+averageMph);
        
        
            
    }
}