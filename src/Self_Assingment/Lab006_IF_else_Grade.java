package Self_Assingment;

import java.util.Scanner;

public class Lab006_IF_else_Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Total Marks");

        int Grade = scanner.nextInt();

        if(Grade<=100 && Grade>=90) {
            System.out.println("Your Grade is " + "A");
        } else if (Grade>=80 && Grade<=89) {
            System.out.println("Your Grade is " + "B");
        } else if (Grade>=70 && Grade<=79) {
            System.out.println("Your Grade is " + "C");
        } else if (Grade>=60 && Grade<=69) {
            System.out.println("Your Grade is " + "D");
        } else if (Grade>=0 && Grade<=59) {
            System.out.println("Your Grade is " + "F");

        }
        System.out.println("Enter the Marks Between O to 100 only ");
    }
}


//Assignment 3: Grade Classifier
//
//Description: Develop a program that assigns letter grades based on numeric scores.
//
//        Requirements:
//
//Prompt the user to enter a score (0-100).
//Use if-else statements to determine the letter grade:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
//Print the corresponding letter grade.


