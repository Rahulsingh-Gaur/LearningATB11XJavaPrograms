package JAVA_11X_Task;

import java.sql.SQLOutput;

public class Lab015_String_all_funcation {
    public static void main(String[] args) {

        String Fname = "RAHUL";
        String Lname ="hajari";

        //lowercase
        String Result =Fname.toLowerCase();
        System.out.println("Lowecase case funcation :" +Result);

        //concate using fucnation
        String Result1=Fname.concat("Gaur");
        System.out.println("Concated string is : "+ Result1);

        //concate using +
        String Result2=Fname+Lname;
        System.out.println("Concate using + : "+Result2);

        //Upper case
        String Result3 =Lname.toUpperCase();
        System.out.println("Upper case funcation :"+ Result3);

        //print first and last char from string
        char Result4 =Fname.charAt(0);
        System.out.println("charAT"+"The First char is : " +Result4);
        System.out.println("The last char is : " + (Fname.charAt(Fname.length()-1)));

        //substring(int beginIndex): Returns a substring starting from the specified index to the end of the string.
        String Result5 = Result1.substring(2,9); //R A H U L G a u r
        System.out.println(Result5);//AHUL

        //Index of
        System.out.println("The String index is :" + (Result1.indexOf('r'))); //RAHULGaur

        //Contains
        System.out.println("String contains the :" + Fname.contains("Z"));

        //Equal
        System.out.println("The matching result is :" + Fname.equals("RaHUL"));

        //Equal case with caseingore
        System.out.println("The matching with Caseirngore :"+ Result1.equalsIgnoreCase("RahulGAUR"));

        //comapre the two string
        System.out.println("Compare the String :"+ Fname.compareTo("RAHUL") );

        //Replace
        System.out.println("The Replace funcation :"+ Fname.replace('R','Z'));

        //Split
         String Email ="Rahulhajri28@gmail.com";
         String[] split =Email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //Start with

        System.out.println("Start with Funcation :" + Fname.startsWith("r"));

        //end with
        System.out.println("End with Funcaton :"+Lname.endsWith("i"));

        //trim
        String Fname1= "      Sing is king     ";
        System.out.println("Trim funcation :" +Fname1.trim());

        //substring
        System.out.println("Sub String is :"+ Fname.substring(2,5));

        //compare
        System.out.println("Compare the String int:" + Lname.compareTo("hajari"));









    }
}
