package JAVA_11X_Task;

import javax.sound.sampled.ReverbType;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab014_Parlimdrome_Forloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to check Palidrome");
        String Name = scanner.nextLine();

        int legth = Name.length();
        String Rev1 ="";


        for (int i = legth - 1; i >= 0; i--) {
          Rev1=Rev1+Name.charAt(i);
        }
        System.out.print("Revered String is :" + Rev1 +"\n" );
        System.out.println(Rev1.length());
        if (Name.equals(Rev1))
            System.out.println("\nThe Entered String is Palidrome");
            else{
                    System.out.println("The Entered String is not a Palidrome");
                }
            }}




////✅ Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)