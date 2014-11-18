////
import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        final int NUMBER_OF_ELEMENTS=10;
        int[] numbers=new int[NUMBER_OF_ELEMENTS];
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 10 ints- ");
        int sum=0;
        for (int i=0;i<NUMBER_OF_ELEMENTS;i++){
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
        int min=numbers[0];
        for (int k=1;k<numbers.length;k++){
            if (numbers[k]<min){
                min=numbers[k];
            }
        }
        System.out.println("The lowest entry is "+min);
        int max=numbers[0];
        for (int j=1;j<numbers.length;j++){
            if(numbers[j]>max){
                max=numbers[j];
            }
        }
        System.out.println("The highest entry is "+max);
        System.out.println("The sum is "+sum);
        for (int g=0;g<numbers.length;g++){
            System.out.println(numbers[g]+" "+numbers[9-g]);
        }
    }
}