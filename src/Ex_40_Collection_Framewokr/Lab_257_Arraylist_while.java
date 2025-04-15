package Ex_40_Collection_Framewokr;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Lab_257_Arraylist_while {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        ArrayList<String> names=new ArrayList();
        ArrayList <Integer> Age= new ArrayList();

        String continueInput= "Y";
        while(continueInput.equalsIgnoreCase("y"))
        {

            System.out.println("Enter the name");
            String name=scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer ages =scanner.nextInt();
            Age.add(ages);

            scanner.nextLine();
            System.out.println("Do you want to add anotehr record Y/N :");
            continueInput =scanner.nextLine();

        }

        for (Object o1:names){
            System.out.println("name:"+(o1));
        }
        for (Object o2:Age){
            System.out.println("Age:"+(o2));
        }


        scanner.close();
    }
}
