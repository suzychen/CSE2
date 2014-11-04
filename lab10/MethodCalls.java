//////
//
//
//
public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
  

    public static int addDigit(int m, int n){
        int x=10;
        int y=0;
        if (m>0){
            while (m>x){
                x*=10;
            }
        y=m+n*x;
        }
        else if (m<0){
            while(m<(-x)){
                x*=10;
            }
        y=m-n*x;
        }
    return y;
    }
    
    public static int join(int p, int q){
        int s=0;
        if (p>0 || q>0){
            s=addDigit(q,p);
        }
        else{
            s=addDigit(-q,-p);
        }
    return s;
    }
}