//
import java.util.Scanner;
public class Loop2{
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        String answer="Y";
        while (answer.equals("y")||answer.equals("Y")){
        int nStar=-1;
        while (nStar>15 || nStar<1){
            System.out.print("Enter an int between 1 and 15(1): ");
            while (myScanner.hasNextInt()==false){
                if (myScanner.hasNextInt()){
                    nStar=myScanner.nextInt();
                    break;
                }
                else {
                    System.out.print("Enter an int between 1 and 15(2)");
                    myScanner.next();
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
        System.out.print("Enter y or Y to go again: ");
        answer=myScanner.next();
        if (answer.equals("y")==false && answer.equals("Y")==false){
            break;
        }
            
            
        }
    }
}