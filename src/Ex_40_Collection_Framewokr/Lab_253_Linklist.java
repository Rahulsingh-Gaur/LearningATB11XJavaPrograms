package Ex_40_Collection_Framewokr;

import java.util.LinkedList;
import java.util.List;

public class Lab_253_Linklist {
    public static void main(String[] args) {
        List list =new LinkedList();

        //list one
        list.add("Yograjsingh");
        list.add("Devisingh");
        list.add(8898);
        list.addFirst("Rahul");
        list.addLast("Hajari");
        list.add(" ");
        list.addLast("Hajari");

        //display all the list
        System.out.println(list);
        System.out.println("--------------");

        //access the pertiular element
        System.out.println("First element :"+list.getFirst());
        System.out.println("Last elemnt :"+list.getLast());
        System.out.println(list.size());
        System.out.println("--------------");

        //remove the element
        System.out.println("Element Remove");
        list.removeFirst();
        list.removeLast();
        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());

        System.out.println("--------------");
        //list two
        List list2=new LinkedList();
        list2.add("lolo");

        list2.removeAll(list2);
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());


    }
}
