package JAVA_11X_Task;

import java.util.Scanner;

public class Lab013_Palimdorme_stringbuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name !!!");
        String name = scanner.nextLine();
        int Length =name.length();
        String Rev = new StringBuilder(name).reverse().toString();
        System.out.println(Rev);

        if (name.equals(Rev)){
            System.out.println("THis is Palidrome");
        }
        else {
            System.out.println("THis is not Palidrome");
        }

        }

    }

//✅ Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)