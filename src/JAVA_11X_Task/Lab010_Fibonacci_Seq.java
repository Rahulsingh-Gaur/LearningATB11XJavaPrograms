package JAVA_11X_Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab010_Fibonacci_Seq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check the Fibonacci Sequence!");

        int Num1=scanner.nextInt();
        System.out.println("Fibonacci Sequence is as follows");
        int Fib1=0;
        int Fib2=1;
        System.out.println(Fib1);
        System.out.println(Fib2);
        for(int i=2;i<=Num1;i++){
            int sum =Fib1+Fib2;
            System.out.println(sum);

            Fib1=Fib2;
            Fib2=sum;
        }


    }}

//Calculation:
//
//    Each Fibonacci number is calculated explicitly by adding the two preceding numbers.
//
//    For example:
//
//        fib2 = fib0 + fib1
//
//        fib3 = fib1 + fib2
//
//        And so on, up to fib9