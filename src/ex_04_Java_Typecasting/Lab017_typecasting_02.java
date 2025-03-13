package ex_04_Java_Typecasting;

public class Lab017_typecasting_02 {

    public static void main(String[] args) {
        int a=989897899; // make sure this input should be in range of Int data type
        int b=a; //Wideing using implicit
        byte c=(byte)b; //Narowing using Explicit
        short d=(short)c; //Narowing using Explicit
        int e=d; // Wideing using implicit
        long f=a;// Wideing using implicit

        float g= 5965969.1344F;
        int h= (int)g; // Narowing using explicit
        short I = (short)h; // Narowing using explicit
        byte J = (byte)I;// Narowing using explicit
        int k =J; // Widing using Implicit

        System.out.println("the value is a :" +a);
        System.out.println("the value is b:" +b);
        System.out.println("the value is c:" +c);
        System.out.println("the value is d:" +d);
        System.out.println("the value is e:" +e);
        System.out.println("the value is f:" +f);
        System.out.println("the value is h:" +h);
        System.out.println("the value is I:" +I);
        System.out.println("the value is J:" +J);
        System.out.println("the value is k:" +k);
    }
    }
