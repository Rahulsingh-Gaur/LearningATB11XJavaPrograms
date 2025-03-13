package ex_05_Ternary_operator;


public class lab019_Basic {
    public static void main(String[] args) {
        int age = 18;
        // condition ? expression1 : expression2
        // we added String as data type bex we need to store the result as string form
//        String result =  age >=18 ? "you are eligible for Vote" : "You are not eligible for vote ";
//        System.out.println(result);

//        int Bornyear = 2014;
//        String Aadhar_present = "YEs";
//
//        String BornResult = (Bornyear>2015) ? "Aahdar Required" : "Aadhar is not Required";
//
//        System.out.println(BornResult);

        int Bornyear1 = 2019;
       // int age1 = 65;
        String Dob_Doc_Preent = "NO";

        String DOB_Doc_Result = (Bornyear1 > 2018) ?
                //( (age1<= 65 )? "Age is eligible." : "Age is not eligible."):
                ((Dob_Doc_Preent.equals("NO")) ? "Birth Cert Required." : "No Birth Cert."): "No action" ;
        System.out.println(DOB_Doc_Result);


    }
}