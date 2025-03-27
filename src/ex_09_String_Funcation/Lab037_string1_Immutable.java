package ex_09_String_Funcation;

public class Lab037_string1_Immutable {
    public static void main(String[] args)
    {
        String name= "rahul";
        name .toUpperCase();
        System.out.println(name);
        //Strings are Immutable
        //Methods like toUpperCase() return a new String instead of modifying the original.
        //toUpperCase() Does Not Modify name
        //name.toUpperCase() creates a new String ("RAHUL") but does not assign it back to name.

        //String newname =name.toUpperCase();//this way we can make upper case
        //System.out.println(newname); //RAHUL
    }
}

//Why Does This Happen?
//Strings are Immutable
//In Java, String objects cannot be modified after creation.

//Methods like toUpperCase() return a new String instead of modifying the original.

//toUpperCase() Does Not Modify name

//        name.toUpperCase() creates a new String ("RAHUL") but does not assign it back to name.
//
//The original name remains unchanged.