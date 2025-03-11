package ex_02_Java_Basic;

public class Lab_005_Banksms_printf {
    public static void main(String[] args) {
        String  Name = "Rahulsingh Gaur";
        String  Bank= "SBI BANK !";
        double  acc_no = 20000454566567d;
        int Amount = 7500;

        System.out.printf("Hello Mr. %s , RS %d is Credit in %.0f ,Thank you so much for banking with us %s ", Name,Amount,acc_no,Bank);
    }
}
