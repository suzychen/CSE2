//
//
//
//
//
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  }
	public static int getInt(Scanner scan){
		int temp=0;
		
		if (scan.hasNextInt()){
			temp=scan.nextInt();
		}
		else{
			while (!scan.hasNextInt()){
			System.out.println("You did not enter an int-");
			scan.next();
			}
		temp=scan.nextInt();
		}
		return temp;
	}
	
	public static int larger(int i, int j){
		int larger=0;
		if (i>j){
			larger=i;
		}
		else if (i<j){
			larger=j;
		}
		return larger;
	}
	
	public static boolean ascending (int m, int n, int o){
		if (m<n && n<o){
			return true;
		}
		else {
			return false;
		}
	}
	
}
