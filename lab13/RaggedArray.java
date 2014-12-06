//
//
//
import java.util.Arrays;
import java.util.Random;
public class RaggedArray{
    public static void main(String[] args){
        
        
        int [][] array=new int[5][];
        for(int i=0;i<5;i++){
            array[i]=new int[3*i+5];
            for(int j=0;j<(i*3+5);j++){
                array[i][j]=(int)(Math.random()*40);
            }
            
        }
        System.out.println("The array before sorting:");
        for (int k=0;k<5;k++){
            for (int g=0;g<array[k].length;g++){
                System.out.print(array[k][g]+" ");
            }
            System.out.println();
        }
        
        System.out.println("The array after sorting:");
        for(int i=0;i<5;i++){
            int[] newArray=new int[3*i+5];
            for(int j=0;j<3*i+5;j++){
                newArray[j]=array[i][j];
            }
            Arrays.sort(newArray);
            for (int k=0;k<3*i+5;k++){
                System.out.print(newArray[k]+" ");
            }
            System.out.println();
        }
    }
}