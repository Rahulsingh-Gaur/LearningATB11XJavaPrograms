package ex_03_Java_Basic;

public class Lab011_Relational_operator_java {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a=10;
        int b=-100;
        System.out.println(a>b);

        int Rahul_age=20;
        int Anuja_age=20;
        boolean Result = Rahul_age != Anuja_age; // is not equal to ie. 20 is equal to 20 so its False
        System.out.println("Age is " + Result);

        int a1=100;
        int b1=100;
        System.out.println(a1>=b1);
    }
}
