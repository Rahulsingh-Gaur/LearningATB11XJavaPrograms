package Self_Assingment;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Funcation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the A Value ");
        int A =scanner.nextInt();

        System.out.println("Enter the B Value ");
        int B =scanner.nextInt();

        int Add =Addition_funcation (A,B);
        int Sub =subtraction_funcation(A,B);
        int Div= Div_funcation(A,B);
        System.out.println("THe SUm is :"+Add);
        System.out.println("THe Sub is :"+Sub);
        System.out.println("THe Div is :"+Div);



    }

     static int Div_funcation(int A, int B) {
        int result2=(A/B);
        return result2;

    }

    static int subtraction_funcation(int A, int B) {
        int result1 =(A*B);
        return  result1;
    }

    static int Addition_funcation(int A,int B) {
        int Result =(A+B);
        //System.out.println(Result);
        return Result;
    }
}
