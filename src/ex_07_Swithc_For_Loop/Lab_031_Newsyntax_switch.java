package ex_07_Swithc_For_Loop;

import java.util.Scanner;

public class Lab_031_Newsyntax_switch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Day !");
        String Day = scanner.nextLine();

        switch (Day){

            case "M" -> System.out.println("its Monday");
            case "T"-> System.out.println("its Tuesday");
            default -> System.out.println("Enter the valid day code");


        }

    }
}
