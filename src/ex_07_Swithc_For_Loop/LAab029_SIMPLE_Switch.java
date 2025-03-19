package ex_07_Swithc_For_Loop;

import java.util.Scanner;

public class LAab029_SIMPLE_Switch {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the Day count");
        String Day =scanner.nextLine();

        switch (Day)
        {
            case "M" :
                System.out.println("THis is Monday");
                break;

            case "T":
                System.out.println("This is Tuesday");
                break;

            case "W":
                System.out.println("This is Wednesday");
                break;

            case "TH":
                System.out.println("This is Thursday");
                break;

            case "F":
                System.out.println("This is Friday");
                break;


            case  "Sat":
                System.out.println("This is Saturday");
                break;

            case "sun":
                System.out.println("This is Sunday");
                break;

            default:
                System.out.println("Please enter between 1 to 7 no.only");
                break;



            }
        }
    }
