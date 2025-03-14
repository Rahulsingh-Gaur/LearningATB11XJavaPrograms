package JAVA_11X_Task;

import java.util.Scanner;

public class lab006_Triangle_if_else {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Length of first side of Triangle");
        int L1 = scanner.nextInt();
        System.out.println("Enter the Length of second side of Triangle");
        int L2 = scanner.nextInt();
        System.out.println("Enter the Length of third side of Triangle");
        int L3 = scanner.nextInt();

        if (L1==L2 && L1==L3 && L2==L3)
        {
            System.out.println("The Triangle is equilateral");
        } else if (L1==L2 || L1==L3 || L2==L3) {
            System.out.println("The Triangle is isosceles");
        }
        else {
            System.out.println("The Triangle is scalene");
        }
        }
    }

//Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides, determine if the
//triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
//or scalene (no sides are equal). Use an if-else statement to classify the triangle.