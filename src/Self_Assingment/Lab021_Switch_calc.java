package Self_Assingment;

import java.util.Scanner;

public class Lab021_Switch_calc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Number 1");
        int Num1 =scanner.nextInt();

        System.out.println("Enter the Numberr 2");
        int Num2 =scanner.nextInt();

        System.out.println("Enter the Operator like +,-,/,*");
        String operator =scanner.next();

        switch (operator){

            case "+" -> System.out.println("The Sum of two number is :" +(Num1+Num2));
            case "-" -> System.out.println("The Subtraction of two number is :" +(Num1-Num2));
            case "/" -> System.out.println("The Division of two number is :" +(Num1/Num2));
            case "*" -> System.out.println("The Multiplication of two number is :" +(Num1*Num2));
            default -> System.out.println("Enter the valid Operator like +,-,/,* ");
            }
        }


    }
//this is file
//Create a simple calculator that can perform basic arithmetic operations
// (addition, subtraction, multiplication, division) based on user input.
// The user should enter two numbers and an operator (+, -, *, /),
// and the program should calculate and display the result using a switch statement.
