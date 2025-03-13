package ex_04_Java_Typecasting;

public class Lab018_Realexample_typecast {
    public static void main(String[] args) {
        int Product_price =500;
        byte Service_tax =120; // as per req it should not be more than 125 RS
        float GST = 45.57f;
      //  int total = Product_price+(int)GST+Service_tax; //narowing float to int
        float total = Product_price+GST+Service_tax;
        System.out.println("The total Cost is :" + total);



    }
}
