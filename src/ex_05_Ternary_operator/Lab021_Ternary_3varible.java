package ex_05_Ternary_operator;

public class Lab021_Ternary_3varible {
    public static void main(String[] args) {
        int a=1000;
        int b=455;
        int c=50;
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int Result = (a>b) ?
                  (a > c ? a : c) : // Condition 2
                  (b > c ? b : c); // Condition 3

        System.out.println("the max no is :"+ Result);
    }
}
