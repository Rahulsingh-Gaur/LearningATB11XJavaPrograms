package ex_02_Java_Basic;

public class Lab002_Java_Variable_Types {
    public static void main(String[] args) {

        String Emp_name = "Rahulsingh"; //  String is datatype and Emp_name is variable
        System.out.println("EMP name is :"+ Emp_name);

        byte Age =30; //  byte is datatype and Age is variable where 30 is Value , Store the Data -128 to 127
        System.out.println("Age is :"+ Age);

        int EmpID = 878;  //  'int' is the data type, 'EmpID' is the variable name, and '878' is the value
        System.out.println("EMP code is :"+EmpID);

        boolean isemp = true; //'boolean' is the data type, 'isemp' is the variable name and true is value
        System.out.println("is Rahul bike lover :" + isemp);

        float Hike = 12.22F;   //'Float' is the data type, 'Hike' is the variable name and 12.22 is value
        System.out.println("Salary Hike is :"+ Hike);

        double PF_acc = 9988789999877D; //'double' is the data type, 'PF_acc' is the variable name and 9988789999877D is value
        System.out.println("PF acc no is :"+PF_acc);

        short PF_Amount = 32767;
        System.out.println("PF Amount is :" + PF_Amount);

        long EMp_Previoussalary = 870000000;
        System.out.println("EMP_Old Salary :"+EMp_Previoussalary);

        char EMP_Rating = 'A';
        System.out.println("EMP Rating :" +EMP_Rating); //In Java, the char data type represents a Unicode character.
        //    In Java, a char variable can store a single Unicode character.
        //When an integer is assigned to a char variable, it is interpreted as the Unicode value of the corresponding character.
        //    The Unicode value 65 corresponds to the character 'A'.






    }
}
