package Self_Assingment;

import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab030_Palindrome_String {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the String");
        String FName =scanner.nextLine().toLowerCase();
        String Newstring =Reversename(FName);

        if (Newstring.equals(FName)) {
            System.out.println("this is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }








    }
    private static String Reversename(String FName){
        StringBuffer SB=new StringBuffer(FName);
        return SB.reverse().toString();


    }
}



//Palindrome Checker:
//
//Write a program that checks if a given string is a palindrome (reads the same forward and backward).
//Example: madam is a palindrome, but hello is not.

