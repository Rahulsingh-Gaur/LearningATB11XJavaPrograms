package Java_Sample;

import java.sql.SQLOutput;

public class IIB {

    public static void main(String[] args) {
        System.out.println("MAIN");
        //A a=new A();
        new B();

    }
}

class A {
    {
        System.out.println("Hi,Rahul!");
    }
    {
        System.out.println("Hul!");
    }
}

class B{
    {
        System.out.println("IIB from B");
    }
    static {
        System.out.println("Static");
    }
}