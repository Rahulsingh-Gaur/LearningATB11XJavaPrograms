package JAVA_11X_Task;

import java.util.Scanner;
//Take a user input 2 numbers from the arguments and calculate
// the maximum in between with ternary operator.

public class Lab_008_Consoleinput_task {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number one ");
        int Num1 = scanner.nextInt();

        System.out.println("Enter the Number two");
        int Num2 =scanner.nextInt();

//        int Result = (Math.max(Num1,Num2)); //Math Funcationa
        String Result =(Num1>Num2)? "first enter Number is max":"second enter Number is max" ; // Ternary operation
        if (Result=="first enter Number is max")
        {
            System.out.println(Result +" "+  Num1);
        }
        else{
            System.out.println(Result +" "+ Num2);
        }


    }
}
