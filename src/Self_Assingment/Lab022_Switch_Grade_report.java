package Self_Assingment;

import java.util.Scanner;

public class Lab022_Switch_Grade_report {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Grade !");
        String Grade =scanner.nextLine();

        switch (Grade){
            case "A" -> System.out.println("You are Excellent Rahul");
            case "B" -> System.out.println("You are Good");
            case "C" -> System.out.println("You are Average");
            case "D" -> System.out.println("You  Need Improvement");
            case "F" -> System.out.println("You are Fail");

            default -> System.out.println("Enter the Grade like A,B,C,D,F");
            }


    }
}




//Create a program that takes a letter grade (A, B, C, D, F) from the user
// and displays the corresponding assessment using a switch statement. For example:
//
//    A: Excellent
//    B: Good
//    C: Average
//    D: Need Improvement
//    F: Fail
