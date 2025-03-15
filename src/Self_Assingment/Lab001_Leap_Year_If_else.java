package Self_Assingment;

import java.util.Scanner;

public class Lab001_Leap_Year_If_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");

        int Result = scanner.nextInt();

        if (Result % 4 == 0)
        {
            if (Result%100 ==0) {
                if (Result%400 ==0){
                    System.out.println("This is Leap year");

                }
                else{
                System.out.println("THis is not leap year "); }

            } else {
            System.out.println("This is Leap year");}


        }
        else {
            System.out.println("This is Not Leap year");
        }

    }
}

//4	100	400	year
//T	T	T	Leap
//T	T	F	NOn leap
//T	F	F	Leap
//F	F	F	NOn leap


//    Objective: Write a Java program to check if a given year is a leap year using a nested ternary operator.
//Task:
//    Take a year as input from the user.
//    Use a nested ternary operator to determine if the year is a leap year based on the following rules:
//    A year is a leap year if it is divisible by 4.
//    However, if the year is also divisible by 100, it is not a leap year unless it is also divisible by 400.
//    Print whether the year is a leap year or not.
    //Leap years: 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048
//Non-leap years: 1700, 1800, 1900, 2100, 2200, 2300, and 2500


