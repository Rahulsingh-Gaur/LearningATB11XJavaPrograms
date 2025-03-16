package Self_Assingment;

import java.util.Scanner;

public class Lab010_Password_checker_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Password !!");

        String Result = scanner.nextLine();
        System.out.println("The Enter password is :" + Result);

        int count = Result.length();
        System.out.println(count);
        String regex = "[^a-zA-Z0-9]";

        if (count >= 6)
        {
            if (count >= 10 && ! Result.matches(".*" + regex + ".*"))
            {
                if (count >= 10 && Result.matches(".*" + regex + ".*"))
                {
                        System.out.println("Very Strong Password");
                    }
                else {
                        System.out.println("Strong Password");
                    }
                } else
                {
                    System.out.println("Medium Password");
                }
            } else
            {
                System.out.println("weak Password");
            }
        }
    }

//Password Strength Checker:
//
//Write a program that prompts the user to enter a password. Use if-else statements to check the strength of the password based on the following criteria:
//Weak: Less than 6 characters
//Medium: 6-10 characters, but no special characters
//Strong: 6-10 characters with at least one special character
//Very Strong: More than 10 characters
//Print the strength of the password.

