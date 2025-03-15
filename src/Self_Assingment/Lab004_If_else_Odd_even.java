package Self_Assingment;

import java.util.Scanner;

public class Lab004_If_else_Odd_even {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");

        int Result = scanner.nextInt();
        if (Result%2==0)
        {
            System.out.println("Entered number is Even");
        }
        else
        {
            System.out.println("The Entered number is Odd");
        }
    }
}

//Assignment 1: Even or Odd Number
//
//Description: Write a program that checks whether a number is even or odd.
//
//Requirements:
//
//Prompt the user to enter an integer.
//Use an if-else statement to determine if the number is even or odd.
//Print the result.

