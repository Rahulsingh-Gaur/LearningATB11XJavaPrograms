package Self_Assingment;

import java.util.Scanner;

public class Lab003_Turnary_Discount_calc {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the Purchase Amount ₹ ");

        int purchase_amount = scanner.nextInt();
        int Discount1 = 10;
        int Discount2 = 20;
        int Discount3 = 30;


        double Final_Cost =(purchase_amount>=100 && purchase_amount<=499) ? (purchase_amount)-((purchase_amount*Discount1)/100):
                           (purchase_amount>=500 && purchase_amount<=999) ? (purchase_amount)-((purchase_amount*Discount2)/100):
                                   (purchase_amount>=1000)?(purchase_amount)-((purchase_amount*Discount3)/100):(purchase_amount);

        System.out.println("Total Purchase Amount is ₹: " +(purchase_amount));
        System.out.println("Total Discount Amount ₹: " +(purchase_amount-Final_Cost));
        System.out.println("Total Final Amount ₹: " +(Final_Cost));
    }

}



//Discount Calculator
//Description: Create a program that calculates the discount based on the total purchase amount.
//        Requirements:
//
//Prompt the user to enter the total purchase amount.
//Use nested ternary operators to determine the discount:
//No discount for amounts less than $100.
//        10% discount for amounts between $100 and $499.
//        20% discount for amounts between $500 and $999.
//        30% discount for amounts $1000 and above.
//Calculate and display the final amount after applying the discount.
