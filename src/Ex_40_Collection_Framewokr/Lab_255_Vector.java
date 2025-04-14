package Ex_40_Collection_Framewokr;

import java.util.*;

public class Lab_255_Vector {
    public static void main(String[] args) {
        Vector v1=new Vector();
        Vector v2=new Vector(2);

        v1.add("Rahul");
        v1.add("Yograksingh");
        v1.add("Hajari");
        v1.add("Gaur");

        v2.add("Mumbai");
        v2.add("Pune");
        v2.add("Nasik");

        v1.remove("Gaur");
        //get the size
        System.out.println("V1 size:"+v1.size());
        System.out.println("V2 size:"+v2.size());
        System.out.println("Total size:"+(v1.size()+ v2.size()));
        System.out.println(v1);
        System.out.println(v2);

        //Element valdaition
        System.out.println(v1.contains("Gaur"));

        //display the Elemnt using for
        System.out.println("-----print using for------");
        for (int i=0;i<v1.size();i++){
            System.out.println(v1.get(i));
        }

        //display the Elemnt using for Each
        System.out.println("---- print using foreach-------");
        for (Object o:v1)
        {
            System.out.println(o);
        }

        //display the Elemnt using  Iterator
        System.out.println("---- print using Iterator-------");
        Iterator iterator= v2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

        //display the Elemnt using  Enumeration
        System.out.println("---- print using Enumeration-------");
        Enumeration<Objects> enumeration=v1.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //display the Elemnt using  ListIterator
        System.out.println("---- print using ListIterator-------");
        ListIterator listIterator=v1.listIterator();
        while (listIterator.hasNext()){
        System.out.println(listIterator.next());
        }

        //display the Elemnt using  list rev
        System.out.println("---- print using ListIterator-------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
