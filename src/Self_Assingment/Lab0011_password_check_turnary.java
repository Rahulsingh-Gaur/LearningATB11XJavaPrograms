package Self_Assingment;

import java.util.Scanner;

public class Lab0011_password_check_turnary {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Password");

        String Result = scanner.nextLine();
        int count = Result.length();

        System.out.println("The Password length is :"+ count);
        String regex = "[^a-zA-Z0-9]";;

        String FinalReslt = (count>=6)? ((count>=6 && count<=10 && ! Result.matches (".*" +regex +".*"))? "Medium Password":
                            (count>=10 && Result.matches (".*" +regex +".*")) ?"Very Strong password ":"Strong Password"):"Weak password";

        System.out.println(FinalReslt);


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
