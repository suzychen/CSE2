//
//
//
//
public class Exam2{
    /*public static void main(String[] args){
        for (int i=0;i<=4;i++){
            for (int k=i+1;k!=0;k--){
                System.out.print(i);
            }
        System.out.println();
        }
        
        for (int i=5;i<=9;i++){
            for(int j=10-i;j!=0;j--){
                System.out.print(i);
            }
        System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*for (int i=0; i<5; i++){
            for (int j=0;j<i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i=5; i<10; i++){
            for (int j=10-i; j>0; j--){
                System.out.print(i);
            }
            System.out.println();
        }
        */
        
        
        
        
        
        
        /*
        for(int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                if(j<=i && i<5){
                    System.out.print(i);
                }
                if(j<10-i && i>=5){
                    System.out.print(i);
                }
            }
            
            System.out.println();
        }*/
        
        
        
        
    
    public static void main(String[] args){
        int x[]={1,2,4,6};
        double[] u={3,4,5,6,7},v={2,4,5};
        System.out.println(enigma(v,u,x));
        System.out.println(display(x));
        System.out.println(display(u));
        System.out.println(display(v));
    }
    public static int enigma(double x[], double y[], int z[]){
        double []temp;
        temp=x;
        temp[z[2]]=42.0;
        y=x;
        y[0]=2.34;
        return z[z[0]];
    }
    
    public static String display(int[] x){
        String out="{";
        for (int i=0;i<x.length;i++){
            if(i>0){
                out+=",";
            }
            out+=x[i];
        }
        return out+"}";
      }
    /*
    public static void main(String[] args){
        int[] x={3,12,15,6,4,7,0,0,0};
        System.out.println(print(x));
    }
    
    public static String print(int [] x){
        String out=" ";
        if(x[0]<=x.length-1){
            out="{";
            for (int i=1;i<x.length;i++){
                if(x[i]!=0){
                    if(i>1){
                        out+=",";
                    }
                    out+=x[i];
                }
                else{
                    out+="}";
                    break;
                }
            }
        }
        else{
            out="Error:x[0] exceeds x.length-1.";
        }
        return out;
    }*
    public static void main(String[] args){
        String x[]={"one","two","to","fifteen","three"};
        String y[]=range(x);
        System.out.println(display(y));
        
    }
    
    public static String display(String[] x){
    String out="{";
    for (int i=0;i<x.length;i++){
        if(i>0){
            out+=",";
        }
        out+=x[i];
    }
    return out+"}";
  }
    
    
    public static String[] range(String x[]){
        String[] result=new String [2];
        int min=x[0].length();
        int max=x[0].length();
        for (int i=1;i<x.length;i++){
            if(x[i].length()<=min){
                min=x[i].length();
                result[0]=x[i];
            }
            else if(x[i].length()>max){
                max=x[i].length();
                result[1]=x[i];
                
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] x={1,10,3,7},y={2,3,4,5,10,6};
        System.out.println(display(overlap(x,y)));
    }
    
     public static String display(int[] x){
        String out="{";
        for (int i=0;i<x.length;i++){
            if(i>0){
                out+=",";
            }
            out+=x[i];
        }
        return out+"}";
      }
    
    public static int[] overlap(int[] x,int[] y){
        int n=0;
        if(x.length<y.length){
            n=x.length;
        }
        else{
            n=y.length;
        }
        int[] array=new int[n+1];
        array[0]=0;
        int m=1;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(x[i]==y[j]){
                   
                    array[m]=x[i];
                    m++;
                }
            }
        }
        int count=0;
        for(int k=1;k<array.length;k++){
            if(array[k]!=0){
                count++;
            }
            else{
                array[k]=0;
            }
        }
        array[0]=count;
        return array;
    }*/
    
    
}