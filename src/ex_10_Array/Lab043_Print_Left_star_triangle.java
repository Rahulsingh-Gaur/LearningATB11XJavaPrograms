package ex_10_Array;

import java.util.Scanner;

public class Lab043_Print_Left_star_triangle {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Total Row in number !");
        int Result=scanner.nextInt();

        for(int i=Result;i>0;i--) {
            for (int j = 0; j<i ; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
