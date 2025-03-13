package ex_02_Java_Basic_2;

public class Lab005_Println_Print_printf {
    public static void main(String[] args) {
        String Name ="Rahulsingh Gaur";
        long  Mob_no =89878891l;
        int Salary =25000;
        float temp_1 =12.4565f;

        System.out.println("Result Using Println()");
        System.out.println(Name);
        System.out.println(Mob_no);
        System.out.println(Salary);
        System.out.println("   ");

        System.out.println("Result Using Print()");
        System.out.print(Name);
        System.out.print(" "+ Mob_no);
        System.out.print(" "+Salary);
        System.out.println(" new temp :" + temp_1);
        System.out.println("   ");

        //In Java, the printf() method is used to format and print text to the console,
        // similar to the printf() function in C. It
        // is part of the PrintStream class, which is the class of System.out. Here’s how to use it:
        System.out.println("Result Using Printf()");
        System.out.printf("Name is :%s,Mob is :%d,Salary is :%s,Tempature is : %.3f" ,Name,Mob_no,Salary,temp_1);

    }
}

//    %d: Formats the integer number.
//    %s: Formats the string text.
//    %.2f: Formats the floating-point number pi to two decimal places.
//    %10s: Right-justifies the string in a field of width 10.
//    %5d: Right-justifies the integer in a field of width 5.
//    %10.2f: Right-justifies the floating-point number in a field of width 10, with 2 decimal places.
