package Self_Assingment;

import java.util.Scanner;

public class Lab008_Simple_intreset_if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total outstnading Loan amount ");
        float Principle = scanner.nextFloat();
        System.out.println("Enter the total ROI for Loan amount ");
        float ROI = scanner.nextFloat();
        System.out.println("Enter the total Duration of Loan ");
        int Duration = scanner.nextInt();

        if (Principle>0 && ROI>0 && Duration>0)
        {
            float Result = (float)((Principle*ROI*Duration)/100);
            System.out.println("The Simple intrest is :" + (Result));
        }
        else
        {
            System.out.println("Enter the Correct Input ");
        }
    }
}
//Assignment 4: Simple Interest Calculator
//
//Objective: Write a program to calculate simple interest based on user input.
//
//        Requirements:
//
//Prompt the user to enter the principal amount, rate of interest, and time in years.
//        Use if-else statements to check if the values are valid (e.g., principal > 0, rate > 0, time > 0).
//Calculate the simple interest using the formula: SI=P×R×T100SI=100P×R×T​.
//Print the calculated simple interest or an error message if the inputs are invalid.
