package Ex_40_Collection_Framewokr;

import java.util.ArrayList;
import java.util.List;

public class Lab_256_Nested_Arraylist {
    public static void main(String[] args) {

        List Fruits =new ArrayList();
        Fruits.add("Mango");
        Fruits.add("Chiko");
        Fruits.add("Apple");
        System.out.println(Fruits);

        List Vegi =new ArrayList();
        Vegi.add("Palak");
        Vegi.add("Tomato");
        Vegi.add("potato");
        System.out.println(Vegi);

        List Finallist =new ArrayList();
        Finallist.add(Fruits);
        Finallist.add(Vegi);
        System.out.println(Finallist);



    }
}
