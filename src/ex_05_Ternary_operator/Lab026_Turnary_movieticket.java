package ex_05_Ternary_operator;
import java.util.Scanner;
public class Lab026_Turnary_movieticket {
    public static void main(String[] args) {
        Scanner scanner1 =new Scanner(System.in);

// customer age calucation
        System.out.println("Enter the Customer age");
        int age = scanner1.nextInt();
        int ticket_price = (age>=12 && age<=17)? 8 :(age>=18 && age<60)? 12 :(age>=60)? 9:5;

        System.out.println("The ticker price is "+ ticket_price);

// time base discount
        System.out.println("Enter the Time in 24 format");

        int Discount_time =scanner1.nextInt();
        int Discount = (Discount_time>=6 && Discount_time<=12)? 2:(Discount_time>=18 && Discount_time<=24)? 1:0;
        System.out.println("The Applicable disocunt is ₹:" + Discount);


        //Ticket price
        System.out.println("Final Ticket cost is ₹ :"+(ticket_price-Discount));

    }
}

// less than 12 ->5
// between 12 to 17 ->8
//18 above ->23
//-------------------------
//(before 12 PM), apply a $2 discount.
//(after 6 PM), apply a $1 discount.

//For all other times, no discount is applied.
// 12:01 PM to 6.00 PM

//Problem Statement
//
//Write a Java program that calculates the ticket price for a movie theater based on the following rules:
//
//Age-Based Discounts:
//
//If the person is below 12 years, the ticket price is $5.
//
//If the person is between 12 and 17 years, the ticket price is $8.
//
//If the person is 18 years or older, the ticket price is $12.
//
//        Time-Based Discounts:
//
//If the movie is during morning hours (before 12 PM), apply a $2 discount.
//
//If the movie is during evening hours (after 6 PM), apply a $1 discount.
//
//For all other times, no discount is applied.
//
//Special Conditions:
//
//If the person is a senior citizen (age 60 or above), they get an additional $3 discount on top of any other discounts.