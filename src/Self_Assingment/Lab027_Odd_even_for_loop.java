package Self_Assingment;

public class Lab027_Odd_even_for_loop {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println(i + " is even number");
                continue;
            }

            {
                System.out.println(i +" is odd number");
            }
        }

    }
}
