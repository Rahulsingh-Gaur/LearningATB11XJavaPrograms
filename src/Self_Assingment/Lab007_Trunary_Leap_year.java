package Self_Assingment;

import java.util.Scanner;

public class Lab007_Trunary_Leap_year {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Year ");

        int Result =scanner.nextInt();
        System.out.println(Result);

        String Year = (Result%4==0) ?
                ((Result%100==0)?
              ((Result%400==0) ? "This is Leap year ":"This is not leap year" ):"THis is leap year"):
             "this is not leap year";


        System.out.println(Year);



    }
}
//Leap years: 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048
//Non-leap years: 1700, 1800, 1900, 2100, 2200, 2300, and 2500


//Assignment 5: Leap Year Checker
//
//Description: Create a program that checks whether a given year is a leap year.
//
//        Requirements:
//
//Prompt the user to enter a year.
// Use if-else statements to determine if the year is a leap year:
//A year is a leap year if it is divisible by 4 but not divisible by 100, or it is divisible by 400.
//Print whether the year is a leap year or not.

