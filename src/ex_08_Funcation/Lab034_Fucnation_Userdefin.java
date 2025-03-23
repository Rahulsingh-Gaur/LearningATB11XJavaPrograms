package ex_08_Funcation;

public class Lab034_Fucnation_Userdefin {
    public static void main(String[] args) {

        int result=sum(5,4);
        int result1=sum(5,5);
        int result2=sum(5,10);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        int result3=sub(10,5);
        System.out.println(result3);

    }
    static int sum(int a , int b)
    {
        return a+b;
    }

    static int sub (int c,int d)
    {
        return c-d;
    }
}
