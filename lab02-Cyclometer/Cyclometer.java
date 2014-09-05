////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//Cyclometer Java Program
//This program gives the time collapsed, rotation counts and distances for the two trips.
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
    //  add main method
    public static void main (String[] args) {
        int secsTrip1=480;  //Initialize seconds for Trip1
        int secsTrip2=3220; //Initialize seconds for Trip2
        int countsTrip1=1561; //Initialize counts for Trip1
        int countsTrip2=9037; //Initialize counts for Trip2
        double wheelDiameter=27.0, //Initialize and declare wheelDiameter
        PI=3.14159, //This gives the approximate numerical value for PI
        feetPerMile=5280,   //This gives value for feet per mile
        inchesPerFoot=12,   //This gives value for inches per foot
        secondsPerMinute=60;    //This gives value for seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //Declare distance for Trip1, Trip2 and totalDistance
        
        System.out.println ("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                countsTrip1+" counts.");
        System.out.println ("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travel
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println ("Trip 1 was "+distanceTrip1+" miles");
        System.out.println ("Trip 2 was "+distanceTrip2+" miles");
        System.out.println ("The total distance was "+totalDistance+" miles");
    }
}
