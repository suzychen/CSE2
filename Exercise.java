/////////////
//
//
//
import java.util.Scanner;
public class Exercise{
    //my method
    public static void main (String[] args) {
    Scanner myScanner=new Scanner(System.in);
    System.out.print("true && false && true");
    boolean logic= true && false && true;
    String answer="logic";
    String result=myScanner.next();
    if (result == answer) {
        System.out.println("Correct");
    }
    else {
        System.out.println("Wrong"+answer);
    }
    
        
    }
}