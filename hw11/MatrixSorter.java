/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Zijia Chen
//zic217
//This program calls a method named buildMat3d to build a ragged 3D array
//and calls method show() to display the 3D array, method findMin() to find the minimum number
//in the 3D array and then method sort() to sort the required array and then display the sorted array
//
//first compile the program
//  javac MatrixSorter.java
//run the program
//  java MatrixSorter

//my class
public class MatrixSorter{
    //my main method
  public static void main(String arg[]){
    //create a 3D array
    int mat3d[][][];
    //call the submethod builMat3d
    mat3d=buildMat3d();
    //call the submethod show()
    show(mat3d);
    //search and print out the smallest number
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
  	//sort and print out the sorted 3d array
    System.out.println("After sorting the 3rd matrix we get");
    //call submethod sort()
    sort(mat3d[2]);
    //call method show()
    show(mat3d);
   }
   
   //define the submethod build Mat3d()
   public static int[][][] buildMat3d(){
       //initialize and define slab, row, column as zero
       int slab=0;
       int row=0;
       int column=0;
       //create a multidimensional array which has three slabs
       int [][][] mat3d=new int [3][][];
       //create a loop to create rows in three slabs
       //Each slab has 3+2*slab rows
       for (slab=0;slab<3;slab++){
         mat3d[slab]=new int [3+2*slab][];
         //create a loop
         //for jth row in sth slab
         for (row=0;row<3+2*slab;row++){
             //there are s+j+1 columns in that row
           mat3d[slab][row]=new int [slab+row+1];{
               //assign the random number to the column
             for (column=0;column<(slab+row+1);column++){
               mat3d[slab][row][column]=(int)(Math.random()*99)+1;
             }
           }
         }
       }
       return mat3d;
   }

//define the submethod show()
   public static void show(int [][][] mat3d){
     //create a loop
     for(int slab=0;slab<3;slab++){
       System.out.println("---------------------------Slab "+(slab+1));
       //print out the 3d array
       for(int row=0;row<(3+2*slab);row++){
         for(int column=0;column<mat3d[slab][row].length;column++){
           System.out.print(mat3d[slab][row][column]+" ");
         }
         System.out.println();
       }
     }
   }
   
   //define the submethod findMin()
   public static int findMin(int [][][] mat3d){
     //initialize the min as 100 since the number in the array will all be less than 100
     int min=100;
     //create loop to find the minimum
     for(int slab=0;slab<3;slab++){
       for(int row=0;row<(3+2*slab);row++){
         for(int col=0;col<(slab+row+1);col++){
             //replace the value with the newly found minimum
           if (mat3d[slab][row][col]<=min){
             min=mat3d[slab][row][col];
           }
         }
       }
     }
     //return the value
     return min;
   }
   
   //define the submethod sort()
   public static void sort(int[][]mat3d){
    //create a loop
    //since just sort the third slab, we know that there are seven rows 
    for (int i=0;i<7;i++){
        //use selection sort to sort elements in each row
        selectionSort(mat3d[i]);
    }
    //use insertion sort to sort the first entry in each row
    insertionSort(mat3d);
   }
   
   //define the submethod selectionSort()
   public static void selectionSort(int []list){
    for (int i=0;i<list.length-1;i++){
      //initialize the min
      int min=list[i];
      //initialize minIndex
      int minIndex=i;
      //create loop to compare from the number next to list[i]
      for(int j=i+1;j<list.length;j++){
        //if find a number less than min
        if(list[j]<min){
          //min and minIndex are given by new value
          min=list[j];
          minIndex=j;
        }
      }
      //swap
      if(minIndex!=i){
        list[minIndex]=list[i];
        list[i]=min;
      }
    }
  }

//define the submethod insertionSort()
  public static void insertionSort(int [][]a){
    //create a loop to go through seven rows
    for (int i=1;i<7;i++){
        //create a new array which has the elements of examined row
      int [] array=a[i];
      int l;
      //use insertion to compare one by one
      for (l=i-1;l>=0&&a[l][0]>array[0];l--){
        //swap
        int []temp=a[l];
        a[l]=a[l+1];
        a[l+1]=temp;
      }
    a[l+1]=array;
    }
  }
  
   
}
