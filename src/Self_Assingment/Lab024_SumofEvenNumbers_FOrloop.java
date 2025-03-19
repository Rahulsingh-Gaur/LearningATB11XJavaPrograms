package Self_Assingment;

public class Lab024_SumofEvenNumbers_FOrloop {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=100;i++){
            if (i%2==0){
                sum+=i;
            System.out.println(sum);
        }
            else {
                System.out.println(" ");
            }
        }

    }

}

//Write a Java program that calculates the sum of all even integers from 1 to 50 using a for loop.