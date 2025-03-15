package Self_Assingment;

import java.util.Scanner;

public class Lab009_Loan_eligibilty_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the age");
        byte age =scanner.nextByte();
        System.out.println("Enter the Annual Income");
        float income=scanner.nextFloat();
        System.out.println("Enter the Credit score");
        float Credit_score =scanner.nextFloat();

        if (age>=21)
        {
            if (income>=30000)
            {
                if (Credit_score>=650)
                {
                    System.out.println("Hurry you are eligible for Loan");
                }
                else {
                    System.out.println("Sorry you are not eligible for Loan");
                }
            }else {
                System.out.println("Sorry you are not eligible for Loan");
            }
        }else
        {
            System.out.println("Sorry you are not eligible for Loan");

        }
//        if(age >=21 && income>=30000 && Credit_score>650)
//        {
//            System.out.println("Hurry you are eligible for Loan");
//        }
//        else
//        {
//            System.out.println("Sorry you are not eligible for Loan");
//        }
    }
}


//Loan Eligibility Checker:
//
//Create a program that asks the user for their age, annual income, and credit score. Use if-else statements to determine loan eligibility:
//Age: Must be 21 or older
//Income: Must be above $30,000
//Credit Score: Must be above 650
//Print whether they are eligible for the loan or not.

