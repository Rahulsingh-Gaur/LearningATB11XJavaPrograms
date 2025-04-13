package ex_10_Array;

import java.util.Scanner;

public class Lab46_Taking_arrary_data extends RuntimeException {

  public static void main(String[] args) {

    //taking the array size from User
    Scanner scanner= new Scanner(System.in);

    System.out.println("Enter the total size of array");
    int size =scanner.nextInt();

    int Result[] =new int[size];

    //taking the input in size
    System.out.println("Enter the Data :");
    for(int i=0;i<size;i++){
      System.out.print("Element:" + (i+1) + ":" );
      Result[i]=scanner.nextInt();
    }
    System.out.println("--------");

    for(int i=0;i<size;i++){

      System.out.println("The Entered Data is :" + Result[i]);
    }


  }


}
