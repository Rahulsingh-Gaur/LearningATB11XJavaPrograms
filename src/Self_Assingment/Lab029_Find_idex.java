package Self_Assingment;

import java.util.Scanner;

public class Lab029_Find_idex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name :");
        String Fname = scanner.nextLine().toLowerCase();

        System.out.println("Enter the char for index search :");
        char Index = scanner.nextLine().charAt(0);
        boolean found = false;
        for (int i = 0; i < Fname.length(); i++) {
            if (Fname.charAt(i) == Index) {
                System.out.println(Index + " " + "Char is found!!" + " " + "at" + " "  + " " + i);
                found = true;
            } else {
                //System.out.println("Sorry Enter Char not found " + Index);
            }


        }

    }


}