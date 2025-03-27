package ex_09_String_Funcation;

public class Lab40_String_Funcation {
    public static void main(String[] args) {
        String name ="raHUl";
        String Lname ="Gaur";
        String Mname ="Gaur";

        String id = new String("Gaur");

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.concat(" Singh"));
        System.out.println(Mname==Lname);
        System.out.println(Mname.equals(Lname));
        System.out.println("Compare :"+Mname.equals(id));








    }
}
