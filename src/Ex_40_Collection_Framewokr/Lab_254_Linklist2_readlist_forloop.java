package Ex_40_Collection_Framewokr;

import java.util.*;

public class Lab_254_Linklist2_readlist_forloop {
    public static void main(String[] args) {
        List list1 = new LinkedList();

        list1.add("RAM");
        list1.add("Rahul");
        list1.add("SHam");
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);
        System.out.println("-------------");
        for (int i=0;i < list1.size();i++){

            System.out.println(list1.get(i));
        }
        }



    }


