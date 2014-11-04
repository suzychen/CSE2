///////////
//
//
//
import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;
    System.out.print("Enter an int- ");
    
    if (scan.hasNextInt()){
        n=scan.nextInt();
    }
    else{
        do{
    	System.out.print("You did not enter an int; try again- ");
    	scan.next(); //get rid of the junk entered by user
        }while(!scan.hasNextInt());
     n=scan.nextInt();
    }
   
    /*
    while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    }*/
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP

    
    int j=0;
    while (j<=n && j<40){
        int k=j;
        while (k!=0){
            System.out.print('*');
            k--;
        }
        System.out.print("\n");
        j++;
    }


    int k=4;
    while (k<=4){
        System.out.println("k="+k);
    	k++;
    }

    int count=0;
    for (count=0;count<=10;count++){
        if (n==1){
            System.out.println("Case 2");
            continue;
        }
        else if (n==2){
            System.out.println("Case 2");
            continue;
        }
        else if (n==3){
            break;
        }
        else if (n==4){
            System.out.println("Case 4");
            System.out.println("Case 5");
            break;
        }
        else if (n==5){
            System.out.println("Case 5");
            break;
        }
        else {
            System.out.println(n + " is > 5 or <1");
        }
    }
    /*
    int count=0;
    	while(true){
    	switch(n){
    	default: System.out.println(n + " is > 5 or <1");
   	 break;
    	case 1:
    	case 2: System.out.print("Case 2 ");
   	 continue;
    	case 3: break;
    	case 4: System.out.println("Case 4");
    	case 5: System.out.println("Case 5");
   	 break;
    	}
    	count++;
    	if(count>10)
   	 break;
    }*/


    }
}