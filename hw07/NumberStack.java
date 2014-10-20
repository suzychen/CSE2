//////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//The program prompts the user to enter an integer between 1 and 
//9, inclusive, and then prints out displays that depend on the 
//value entered number stack
//
//first compile the program
//  javac NumberStack.java
//run the program
//  java NumberStack

import java.util.Scanner; //import a scanner

//my class
public class NumberStack{
    //my method
    public static void main(String[] args){
     Scanner myScanner=new Scanner(System.in);//create a scanner and import input from scanner
     System.out.print("Enter a number between 1 and 9- ");
     //prompt user to enter an int between 1 and 9
     int n=myScanner.nextInt();
     // get the input from scanner
     
//for loop
    System.out.println("Using for loop: ");
    //when the number printed is less than the number that user entered
    for (int i=1;i<=n;i++){
        //control the number of rows which is the same as the number entered
        for (int j=0;j<i;j++){
            //control the space before the number
            for (int k=0;k<n-i;k++){
                System.out.print("　");//print out space
            }
            //control the times of the number got printed; the times is two times the number entered minus one
            for (int k=0; k<2*i-1;k++){
                System.out.print(i);//print out numbers and number of times as required
            }
        System.out.print("\n");//start a new line
        }
        //same method for printint out hyphens as printing out numbers
        for (int l=0;l<n-i;l++){
             System.out.print(" ");//print out spaces
        }
        for (int l=0; l<2*i-1;l++){
            System.out.print("-");//print out hyphens
        }
        System.out.print("\n");//start a new line
        
    }
//while loop  
    System.out.println("Uing while loop: ");//when we use while loop
    //declare and initialize all the variables
    int o=0;
    int m=0;
    int p=0;
    int q=0;
    int a=0;
    int b=0;
    //when the number is printing is less thant the number entered
    while (o<n){
        o++;//increase o by one
        //when the number of times the number is printed is less than the number is printing
        while(m<o){
            //control the spaces before numbers
            while(a<n-o){
                System.out.print(" ");//print out spaces
                a++;//increase a by one
            }
            //control the number of times the number is printed
            while(b<2*o-1){
                b++;//increase b by one
                System.out.print(o);//print out numbers
            }
            m++;//increase m by one
            System.out.print("\n");//start a new line
            a=0;b=0;//set variables to initial value which is zero
        }
        m=0;//set the value of m back to zero
        
        //same metho for printing out hyphens as printing out numbers
        while (p<n-o){
            p++;//increase p by one
            System.out.print(" ");//print out spaces
        }
        while(q<2*o-1){
            q++;//increase q by one
            System.out.print("-");//print out hyphens
            }
        
        System.out.print("\n"); //start a new line
        p=0;q=0;//set the value of variables back to zero
    }
    
//do-while loop
    System.out.println("Using do-while loop: ");//using do-while loop
    int e=0,f=0,g=0,h=0,s=0,u=0,v=0;//declare and initialize variables
    //when the number is printing is less thant the number entered, do increase e by one in every
    //loop and other internal loops
    do {
        e++;
        //do while the space printed is less than n-e
        do{
            if (f<n-e){
            do{
                System.out.print(" ");//print out spaces
                f++;//increae f by one
            }while(f<n-e);
            }
            //do while the times of number already got printed is less than the number entered
            do{
                g++;//increase g by one
                System.out.print(e);//print out the number entered
            }while(g<2*e-1);
           
        s++;//increase s by 1
        System.out.print("\n");//start a new line
        f=0;g=0;h=0;//set the value of variables back to zero
        }while(s<e);
    s=0;//set the value of s back to zero
        //same method for printint out spaces as for printint out numbers
        if (u<n-e){
        do{
            u++;//increase u by one
            System.out.print(" ");//print out spaces
        }while(u<n-e);
        }
        do{
            v++;//increase v by one
            System.out.print("-");//print out hyphens
        }while(v<2*e-1);
        
        System.out.print("\n"); //start a new line
        u=0;v=0;//set the value of variables back to zero
    }while(e<n);
     
        
        
        
        
        
    }
}