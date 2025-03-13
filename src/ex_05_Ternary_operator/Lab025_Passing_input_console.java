package ex_05_Ternary_operator;
import java.util.Scanner;
public class Lab025_Passing_input_console {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the value for A");
        int a= scanner1.nextInt();
        System.out.println("Enter the value for B");
        int b= scanner1.nextInt();
        System.out.println("Enter the value for C");
        int c= scanner1.nextInt();
        System.out.println("Total Sum is " +(a+b+c));
1    }

}
