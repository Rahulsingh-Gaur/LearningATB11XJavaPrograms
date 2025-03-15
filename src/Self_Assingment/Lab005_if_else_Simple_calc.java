package Self_Assingment;

import java.util.Scanner;

public class Lab005_if_else_Simple_calc {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Select the one Arithmaic operation like ADD ,SUB ,MUL or DIV");
        String Result =scanner.nextLine();
        System.out.println("You have Selcted the:" + Result + " " + "Operation");

        System.out.println("Enter the Num1 : ");
        int Num1 = scanner.nextInt();

        System.out.println("Enter the Num2 : ");
        int Num2 = scanner.nextInt();

        System.out.println(Result);
        if (Result .equals("ADD"))
        {
            System.out.println("The Addition is : "+ (Num1+Num2));
        } else if (Result .equals("SUB")) {

            System.out.println("The Subtraction is : "+ (Num1-Num2));
        } else if (Result .equals("MUL")) {

            System.out.println("The MULTIPLICATION is : "+ (Num1*Num2));

        } else if (Result .equals("DIV")) {
             float DIV1 =((float) Num1/Num2);
            System.out.printf("The Div Result is %f:",DIV1);

        } else
        {
            System.out.println("Enter the correct Opeartion name");
        }
    }
}


//Assignment 2: Simple Calculator
//
//Description: Create a simple calculator that performs addition, subtraction, multiplication, and division.
//
//Requirements:
//
//Prompt the user to enter two numbers and an operator (+, -, *, /).
//Use if-else statements to perform the appropriate operation based on the operator entered.
//Print the result.
//Handle division by zero gracefully.
