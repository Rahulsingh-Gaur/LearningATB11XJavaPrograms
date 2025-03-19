package Self_Assingment;

import java.util.Scanner;

public class Lab_018_Loan_eligibility_iflese {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Age !");
        int age = scanner.nextInt();

        System.out.println("Enter the income");
        float income =scanner.nextFloat();

        System.out.println("Enter the Credit Score");
        float Cs =scanner.nextFloat();

        if (age>=21){
            if (income>=30000){
                 if(Cs>=650){
                     System.out.println("congratulations ! You are eligibile for loan");
                 }
                 else System.out.println("Sorry !You are Not eligibile for loan ");
            }
            else System.out.println("Sorry !You are Not eligibile for loan ");
        }
        else System.out.println("Sorry !You are Not eligibile for loan ");

    }
}

//Create a program that asks the user for their age, annual income, and credit score. Use if-else statements to determine loan eligibility:
//
//    Age: Must be 21 or older
//    Income: Must be above $30,000
//    Credit Score: Must be above 650