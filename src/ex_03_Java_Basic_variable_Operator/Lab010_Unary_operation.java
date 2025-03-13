package ex_03_Java_Basic_variable_Operator;

public class Lab010_Unary_operation {
    public static void main(String[] args) {
        //In Java, a unary operation is an operation that involves only one operand.
        // Unary operators perform various operations such as incrementing/decrementing a value,
        // negating an expression, or inverting a boolean value.
        // Unary operators are often used in expressions to modify the value of a variable.

        // 1. Unary Plus (+)
        int a=+10; // Indicates a positive value (rarely used explicitly since numbers are positive by default).
        System.out.println("a value is :" +a);//positive value assign to a and we have print a

        //2. Unary Minus (-)
        int b=-10; //Purpose: Negates the value of the operand.
        System.out.println("a vlaue is :"+b);

        //3. Post Increment (a++)
        int aa= 11 ;
        int b1= aa++; //Postfix Increment (a++): Actual aa Value assign to b1 ie.11 and then incrment the values as assign to
        System.out.println("aa New value is "+ aa);
        System.out.println("b1 New value is "+ b1);

        //3.1 pre Increment (++a)
        int a1 =1;
        int b2= ++a1;  //prefix : first will increase orignal value of a1 ie .2 then assign entire new value to b2 ie .2
        System.out.println("the a1 valus is :"+a1);
        System.out.println("the a1 valus is :"+b2);

        //4.1 Decrement post decrement (--)
        int a3 =50;
        int b3= a3--; // postfix decremnt
        System.out.println("the a3 valus is :" +a3);
        System.out.println("the b3 valus is :" +b3);

        //4.2 Decrement pre decrement (--)
        int a4=100;
        int b4= --a4;
        System.out.println("the a4 value is:"+a4);
        System.out.println("the b4 value is:"+b4);

        int a5 =-10;
        int b5= 10;
        int a5b5 = a5+b5;
        System.out.println("The SUM result is :"+a5b5);



    }
}
