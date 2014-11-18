/////////////
//
//
//
//Loop exercise
import java.util.Scanner;
import java.util.Random;
public class Exercise{
    /*//my method
    public static void main (String[] args) {
    Scanner myScanner=new Scanner(System.in);
    
    int num=0;
    
    while (num<=1 || num>15){
        System.out.print("Enter an int1 ");
        while (!myScanner.hasNextInt()){
            if (myScanner.hasNextInt()){
                num=myScanner.nextInt();
                break;
            }
            else{
                System.out.print("Enter an int2 ");
                myScanner.next();
            }
        }
        num=myScanner.nextInt();
    }
    
    for (int i=1; i<=num; i++){
        System.out.print("*");
    }
        //System.out.println(" ");
    
    for (int j=0;j<=num; j++){
        for (int k=j;k!=0;k--){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
    public static String x(int a, String b){
        return a+b;
    }
    public static int x(int a, int b, int c){
        return a+b*c;
    }
    public static void main(String []args){
        String m=x(" +one",2);
        int n=x(2,3,4);
        System.out.println(m);
    }
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an int between 1 and 9- ");
        int n=scan.nextInt();
        
        System.out.println("Using for loop:");
        for(int i=1;i<=n;i++){
            for (int k=0;k<i;k++){
                for (int j=0;j<n-i;j++){
                    System.out.print(" ");
                }
                for (int h=0;h<2*i-1;h++){
                    System.out.print(i);
                }
                System.out.println();
            }
            for(int m=0;m<n-i;m++){
                System.out.print(" ");
            }
            for(int o=0;o<2*i-1;o++){
                    System.out.print("-");
            }
            System.out.println();
        }
        
        System.out.println("Using while loop:");
        int a=0,b=0,c=0,d=0,e=0,f=0;
        while (a<n){
            a++;
            while (b<a){
                while(c<n-a){
                    System.out.print(" ");
                    c++;
                }
                while(d<2*a-1){
                    System.out.print(a);
                    d++;
                }
                b++;
                System.out.println();
                c=0;
                d=0;
            }
            b=0;
            while(e<n-a){
                System.out.print(" ");
                e++;
            }
            while(f<2*a-1){
                    System.out.print("-");
                    f++;
            }
            System.out.println();
            e=0;f=0;
        }
        
        System.out.println("Using do-while loop- ");
        int g=0,l=0,p=0,q=0,r=0,s=0,v=0;
        do{
            g++;
            do{
                if(p<n-g){
                    do{
                        System.out.print(" ");
                        p++;
                    }while(p<n-g);
                }
            do{
                System.out.print(g);
                q++;
            }while(q<2*g-1);
            l++;
            System.out.println();
            p=0;q=0;
            }while(l<g);
            l=0;
            
                if(s<n-g){
                    do{
                        System.out.print(" ");
                        s++;
                    }while(s<n-g);
                }
                do{
                    System.out.print("-");
                    v++;
                }while(v<2*g-1);
                s=0;v=0;
                System.out.println();
            
            
        }while(g<n);
    }
    
    public static void main(String[] args){
        Scanner myScanner;
        int k=(new Scanner(System.in)).nextInt();
        for (int i=2; i<k;i++){
            System.out.println("i:" +i);
        }
    
        int m=2;
        while(m<k){
            System.out.println("i:"+m);
            m++;
        }
        
        int n=2;
        do {
            if (n==k){
                break;
            }
            System.out.println("i:"+n);
            n++;
        }while(n<k);
    }
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter an int- ");
        int n=myScanner.nextInt();
        do{
            if(n>0){
                int s=sumsq(n);
                System.out.println("The sum of 1+2*2+3*3+...+n*n for n="+n+" is "+s);
                System.out.print("Enter an int- ");
                n=myScanner.nextInt();
            }
            else{
                break;
            }
        }while(n>0);
        
       
    }
    

    public static int sumsq(int n){
        int y=0;
        for(int i=1;i<=n;i++){
            y+=(i*i);
        }
        return y;
    }
    public static void main(String[] args){
        System.out.println(sumPow(4));
    }
    public static int sumPow(int a){
        int s=1;
        int t=0;
        for(int i=1;i<=a;i++){
            System.out.println("i: "+i);
            for(int k=1;k<=i;k++){
                s*=i;
                System.out.println(s);
            }
            t+=s;
            s=1;
        }
        return t;
    }*/
    public static void main (String[] args) {
    int[] rank = {2,3,4,5,6,7,8,9,10,11,12,13};
        Random gen=new Random();
        System.out.println(rank[gen.nextInt()]);
    }
}