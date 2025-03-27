package JAVA_11X_Task;

public class Lab019_2nd_largest_no_array {
    public static void main(String[] args) {
        int [] number = {100,55,75,21,76,12,21,101,1,5,98,99};

        int Max = number[0];
        int nextmax =number[0];

        for(int i=0;i<number.length;i++){
            if(number[i]>Max){
                nextmax=Max;
                Max=number[i];
            } else if (number[i]>nextmax && number[i]!=Max) {
                nextmax=number[i];
                
            }
        }
        System.out.println("The largrest number is :" + Max);
        System.out.println("The 2nd largest number is :" + nextmax);

    }
}
