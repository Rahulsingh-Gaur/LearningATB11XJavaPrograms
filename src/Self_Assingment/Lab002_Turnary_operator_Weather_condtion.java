package Self_Assingment;

import java.util.Scanner;

public class Lab002_Turnary_operator_Weather_condtion {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the temp in Celsius");
        int Temp =scanner.nextInt();

        String Result = (Temp<0) ? ("It's freezing!") :
                       (Temp>0 && Temp<15)? ("It's cold!"): (Temp>16 && Temp<25) ?( "It's mild!"):
                       (Temp>26 && Temp<35) ? ("It's warm!"):
                       (Temp >35)? ("It's hot!"):"Enter the valid Temp";
        System.out.println(Result);

    }

}
//result = (condition1) ? (expression1) :
//        (condition2) ? (expression2) :
//        (condition3) ? (expression3) :
//        ...
//        (defaultExpression);
//Weather Advisory
//escription: Write a program that provides a weather advisory based on the temperature.
//Requirements:
//Prompt the user to enter the temperature in Celsius.
//Use nested ternary operators to provide advisories:
//        "It's freezing!" for temperatures below 0.
//        "It's cold!" for temperatures between 0 and 15.
//        "It's mild!" for temperatures between 16 and 25.
//        "It's warm!" for temperatures between 26 and 35.
//        "It's hot!" for temperatures above 35.
//Print the corresponding advisory.
