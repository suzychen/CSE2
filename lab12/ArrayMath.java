//
//
//
//
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                      +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static double[] addArrays(double [] x, double [] y){
      double[] result;
      int l,e;
      if (x.length>=y.length){
         l=x.length;
         e=x.length-y.length;
      }
      else{
         l=y.length;
         e=y.length-x.length;
      }
       result=new double[l];
       
      for(int i=0;i<l-e;i++){
        result[i]=x[i]+y[i];
      }
      for (int k=l-e;k<l;k++){
        if (x.length>y.length){
          result[k]=x[k]+0;
        }
        else{
          result[k]=0+y[k];
        }
      }
      
      return result;
  }
  
  public static boolean equals(double [] w, double [] z){
    int count=0;
    boolean answer=true;
    if(w.length != z.length){
      answer=false;
    }
    else if (w.length == z.length){
      for(int j=0;j<w.length;j++){
        if(w[j] == z[j]){
          count++;
        }
      }
      if (count==w.length){
        answer=true;
      }
      else{
        answer=false;
      }
    }
    return answer;
  }
}
