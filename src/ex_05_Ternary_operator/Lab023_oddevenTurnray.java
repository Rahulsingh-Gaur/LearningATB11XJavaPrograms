package ex_05_Ternary_operator;

public class Lab023_oddevenTurnray {
    public static void main(String[] args) {
        int a=100;
        int b=(a%2);
        System.out.println("The ramindar is :"+  b);
        String Result =(b==0)? "This is Even Number ":"This is Odd Number";
        System.out.println(Result);
    }
}
