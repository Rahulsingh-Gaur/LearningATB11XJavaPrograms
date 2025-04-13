package ex_10_Array;

public class Lab_250_Simple_array {
    public static void main(String[] args) {
        int [] marks = {10,20,28,30};
        String[] Name ={"Rahul","ANU"};
        Boolean[] isMarried ={true,false};

        System.out.println("-------User 2 details-------");
        System.out.println("Name :"+" "+(Name[1]));
        System.out.println("Age :"+" "+(marks[3]));
        System.out.println("Marital Status :"+" "+isMarried[0]);

        System.out.println("-------User 2 details-------");
        System.out.println("Name :"+" "+(Name[0]));
        System.out.println("Age :"+" "+(marks[3]));
        System.out.println("Marital Status :"+" "+isMarried[0]);

        System.out.println("-------Length-------");
        System.out.println(marks.length);
        System.out.println(Name.length);
        System.out.println(isMarried.length);



    }
}
