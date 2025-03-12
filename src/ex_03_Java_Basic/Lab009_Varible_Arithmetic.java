package ex_03_Java_Basic;

public class Lab009_Varible_Arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a=10;
        int b=7;
        float c=3.15f;

        System.out.println("The Total SUM is: " +(a+b));
        System.out.println("The Total multiplication is :" +(a*b));
        System.out.println("The Total is Div is:" +(a/b)); // this will give you quotient
        System.out.println("The Total is Subtraction is:" +(a-b));
        System.out.println("The Total is Subtraction is:" +Math.abs(b-a)); // math function where -3 is print like 3
        System.out.println("The Total Remainder is :"+(a%b)); //this will give you Remainder
        System.out.println("The total Div is :" + (a/c));

    }
}
