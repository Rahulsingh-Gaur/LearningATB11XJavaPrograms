package ex_10_Array;

import java.util.Scanner;

public class Lab045_Right_Trinagle_star {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size !");
        int Size = scanner.nextInt();

        for (int i=0;i<Size;i++){

            for (int j=0;i>=j;j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
