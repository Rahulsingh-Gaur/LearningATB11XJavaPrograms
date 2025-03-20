package JAVA_11X_Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab010_Fibonacci_Seq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check the Fibonacci Sequence!");

        int Fibo =scanner.nextInt();
        int Result=0;
        for (int i=0;i<=Fibo;i++){

            Result =Result+i;
            System.out.println(Result);
        }

//        this is done By Using hard coded values ie.10
//        int Fibo_Result =0;
////        for (int i=0;i<=10;i++){
////            Fibo_Result=Fibo_Result+i;
////            System.out.println(Fibo_Result);
        }


    }

//The **Fibonacci Sequence** is a series of numbers where each number is the sum of the two preceding ones, starting from **0 and 1**.
//
//### Formula:
// F(n)=F(n−1)+F(n−2)
//
//where:
//
//- F(0)=0
//- F(1)=1
//### Example of the Sequence:
// 0,1,1,2,3,5,8,13,21,34,55,89,…
//
//Each number is found by adding the **previous two numbers** in the sequence:
//
//- 0+1=1
//- 1+1=2
//- 1+2=3
//- 2+3=5
//- 3+5=8
//- and so on...
//### Applications:
//- Used in **mathematics** and **computer algorithms** (recursion & dynamic programming).
//- Appears in **nature**, such as the arrangement of leaves, flowers, and shells (Golden Ratio).
//- Used in **finance** and **stock market predictions**.