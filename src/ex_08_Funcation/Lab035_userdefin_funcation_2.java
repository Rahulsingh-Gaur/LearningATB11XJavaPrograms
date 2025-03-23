package ex_08_Funcation;

public class Lab035_userdefin_funcation_2 {

    public static void main(String[] args) {
        //1. Without Parameters and Without Return Type.
        Name();

        //2.Without Parameters but With Return Type

        int PI=Age();
        System.out.println("Age is "+ PI);

        //3. With Parameters and Without Return Type
        Emp_Details("Rahul", 25000,77);

        //4. With Parameters and With Return Type
        int mob= Contact_detials(897645788);
        System.out.println("Mob no is :" + mob);
    }

    //1. Without Parameters and Without Return Type.
    static void Name(){
        System.out.println("Hi this is Without Parameters and Without Return Type ");
    }

    //2.Without Parameters but With Return Type
    static int Age(){
        return 25;
    }

    //3. With Parameters and Without Return Type
    static void Emp_Details(String name,double Salary ,int id)

    {
        System.out.println("Emp Details is " + "\n Name is name:" + name + "\n Salary is : "+ Salary  + "\n ID is :" + id);
    }
    //4. With Parameters and With Return Type

    static int Contact_detials(int mob_no){
        return mob_no;
    }

}

//////1. Without Parameters and Without Return Type.
//////2. Without Parameters but With Return Type
//////3. With Parameters and Without Return Type
//////4. With Parameters and With Return Type