package Self_Assingment;

import java.util.Scanner;

public class Lab026_Forloop_any_table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Values");
        int ab= scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*ab);
        }

    }
}
//Create a Java program to print a triangle pattern of stars. For example, for n = 5: