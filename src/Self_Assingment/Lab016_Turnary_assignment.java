package Self_Assingment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab016_Turnary_assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in KG !");
        float weight = scanner.nextFloat();

        System.out.println("Enter the Height CM only !");
        float Height = scanner.nextFloat();
        float MM = (Height)/100 ; //CM to Meter Convert

        float BMI = weight/(MM*MM);
        System.out.printf("The BMI is %.2f" ,BMI);
        System.out.println(" ");
//          System.out.println("Enter BMI");
//            float BMI = scanner.nextFloat();

        String Result = (BMI >=18 && BMI<=24.9)? "Normal weight" :
                (BMI >=25 && BMI<=29.9) ?"Overweight" :
                                (BMI>=30)? "Obesity":"Underweight";

        System.out.printf("Total BMI is : %.2f  and it: %s",BMI,Result );
    }
}

//BMI Calculator:
//Write a program that prompts the user to enter their weight (in kilograms) and height (in meters). Calculate the Body Mass Index (BMI) using the formula:
//BMI=weight(height×height)
//BMI=(height×height)weight​

//Use if-else statements to classify the BMI:

//Underweight: BMI < 18.5
//Normal weight: 18.5 ≤ BMI < 24.9
//Overweight: 25 ≤ BMI < 29.9
//Obesity: BMI ≥ 30
//Print the BMI value and the corresponding category.
