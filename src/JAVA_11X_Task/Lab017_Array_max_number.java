package JAVA_11X_Task;

public class Lab017_Array_max_number {
    public static void main(String[] args) {

        int [] number = {55,75,21,76,12,21,99,1};

        int Max = number[0];

        for(int i=0;i<number.length;i++){
            if(number[i]>Max){
                Max=number[i];
            }
        }

        System.out.println("The largrest number is :" + Max);

    }
}
