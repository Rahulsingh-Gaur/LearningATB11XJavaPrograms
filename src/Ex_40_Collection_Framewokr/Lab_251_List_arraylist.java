package Ex_40_Collection_Framewokr;

import java.util.*;

public class Lab_251_List_arraylist {
    public static void main(String[] args) {
        //Create list but we can not perfrom the operation like add, delete
        List month = List.of("Jan", "Feb", "March", " ", "APR");
        System.out.println(month);

        //array list
        List l = new ArrayList();
        System.out.println("--------Array list----------");
        l.add("MAY");
        l.add(" ");
        l.add("APR");
        l.add("APR");
        l.add("2025");
        l.remove(1);


        System.out.println(l);
        System.out.println(l.size());
    }
}
