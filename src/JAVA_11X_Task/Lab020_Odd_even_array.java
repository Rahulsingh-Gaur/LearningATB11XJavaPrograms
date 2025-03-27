package JAVA_11X_Task;

public class Lab020_Odd_even_array {
    public static void main(String[] args) {

        int[] Number = {2,3,8,6,7,9,10,11,14,18,19,33,99,45,99,100};

        int even = Number[0];
        for (int i =0; i<Number.length;i++){

            if(Number[i]%2==0){
                System.out.println(Number[i]+" : is Even number");
            }
            else{
                System.out.println(Number[i]+" : is ODD Number");
            }
        }

    }
}
