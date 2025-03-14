package JAVA_11X_Task;

public class Lab007_CLI_inputtask_task {
    public static void main(String[] args) {
        String Name = args[0];// First argument: Name
        int age = Integer.parseInt(args[1]);// Second argument: Age (converted to int)
        double salary =Double.parseDouble(args[2]) ;// Third argument: Salary (converted to double)
        System.out.println("The EMP Name is :" + Name);
        System.out.println("The EMP age is :"+(age));
        System.out.println("The EMP Salary is ₹:"+(salary));
    }

//    Take a user input - Name, Age and Salary and print them in the end.
//String FinalResult =args[0];
//    int Marks = Integer.parseInt(FinalResult);

}
