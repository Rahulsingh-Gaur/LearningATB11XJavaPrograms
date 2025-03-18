package Self_Assingment;

import java.util.Scanner;

public class Lab017_Discount_ifelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Total Purchuse amount !");
        int Amount = scanner.nextInt();

        System.out.println("Do you have Membership Yes/No ?");
        String membership = scanner.next();
        System.out.println(membership);

        if (membership.equalsIgnoreCase("Yes")) {

            if (Amount >= 100 && Amount <= 499) {
                int discount1 = (Amount * 10 / 100);
                System.out.println("Total Discount is " + discount1);
                System.out.println("Final Purchase Amount is :" + (Amount - discount1));
            } else if (Amount >= 500 && Amount <= 999) {
                int discount2 = (Amount * 15 / 100);
                System.out.println("Total Discount is " + discount2);
                System.out.println("Final Purchase Amount is :" + (Amount - discount2));
            } else if (Amount >= 999) {
                int discount3 = (Amount * 20 / 100);
                System.out.println("Total Discount is " + discount3);
                System.out.println("Final Purchase Amount is :" + (Amount - discount3));
            } else {
                System.out.println("No Discount Applicable if Purchase amount is less than 100");
            }
        } else if (membership.equalsIgnoreCase("No")) {

            if (Amount >= 100 && Amount <= 499) {
                int discount4 = (Amount * 5 / 100);
                System.out.println("Total Discount is " + discount4);
                System.out.println("Final Purchase Amount is :" + (Amount - discount4));
            } else if (Amount >= 500 && Amount <= 999) {
                int discount4 = (Amount * 10 / 100);
                System.out.println("Total Discount is " + discount4);
                System.out.println("Final Purchase Amount is :" + (Amount - discount4));
            } else if (Amount >= 999) {
                int discount4 = (Amount * 15 / 100);
                System.out.println("Total Discount is " + discount4);
                System.out.println("Final Purchase Amount is :" + (Amount - discount4));
            } else {
                System.out.println("No Discount Applicable if Purchase amount is less than 100");
            }
        }
        else {
                System.out.println("Please Enter the valid Input for Discount Yes OR No");
            }
        scanner.close();
        }
    }













//Discount Tiered Pricing:

//Create a program that prompts the user to enter the total purchase amount and checks if they have a membership (yes/no).
// Use if-else statements to determine the discount:
//No membership:
//        0-99: No discount
//            100-499: 5% discount
//            500-999: 10% discount
//            1000 and above: 15% discount
//With membership:
//            0-99: No discount
//            100-499: 10% discount
//            500-999: 15% discount
//            1000 and above: 20% discount
