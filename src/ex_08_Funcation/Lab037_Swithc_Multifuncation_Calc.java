package ex_08_Funcation;

import java.util.Scanner;

public class Lab037_Swithc_Multifuncation_Calc {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Enter the Num1");
        if(scanner.hasNextInt())
            a = scanner.nextInt();
        else {
            System.out.println("Alert !! only Integer will accept");
            System.exit(0);
        }

        System.out.println("Enter the Num2");
        if(scanner.hasNextInt())
            b =scanner.nextInt();
        else {
            System.out.println("Alert !! only Integer will accept");
            System.exit(0);

            System.out.println("Operator");
            String operator = scanner.next();

            switch (operator)
            {
                case "+"-> Addition(a,b);
                System.out.println(Result);
            }
        }

//        //Calling the Addition Funcation
//        int Result1=Addition(a,b);
//        System.out.println("The Addition is :"+ Result1);
//
//        //Calling the Subtraction Funcation
//        int Result2=Subtraction(a,b);
//        System.out.println("The Subtraction is :"+ Result2);
//
//        //Calling the Multiplcation Funcation
//        int Result3=Multiplcation(a,b);
//        System.out.println("The Multiplcation is :"+ Result3);
//
//        //Calling the Devision Funcation
//        int Result4=Division(a,b);
//        System.out.println("The Division is :"+ Result4);
    }

    // Creating the method/funcation out of Main method and calling this method from main class
    static int Addition(int a , int b ){
        return  a+b ;
    }

    static int Subtraction (int a, int b){
        return a-b;
    }
    static int Multiplcation (int a ,int b){
        return a*b;
    }

    static int Division (int a, int b){
        if (b==0) {
            System.out.println("Div by zero is not allowed !!!");
            System.exit(0);
        }
        return a/b;

    }
}

