package Self_Assingment;

import java.util.Scanner;

public class Lab0012_Adms_Trunary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student Age !!");
        int age = scanner.nextInt();
        System.out.println("Entered Age is :" + age);

        int Fees = (age < 12 && age >= 1) ? 0 : (age >= 12 && age < 18) ? 5000 : (age >= 18) ? 7000 : 0;
        System.out.println("The Student Fees is :" + Fees);

        System.out.println("Do you have Discount Code:");
        Scanner scanner1 = new Scanner(System.in);
        int Dis =scanner1.nextInt();
        System.out.println(Dis);

        int Final = (Dis==1)? ((Fees==5000 || Fees==7000)?2000:3000):0;
        System.out.println(Final);
        System.out.println("The Final Fees will be :"+ (Fees-Final));

    }
}

//Event Admission:
//
//Write a program that asks the user for their age and whether they have a ticket (yes/no). Use if-else statements to determine admission:
//Under   12: Free admission
//        12-17: $5 admission if they have a ticket, $10 if they do not.
//        18 and older: $10 admission if they have a ticket, $20 if they do not.
//Print the admission fee.


