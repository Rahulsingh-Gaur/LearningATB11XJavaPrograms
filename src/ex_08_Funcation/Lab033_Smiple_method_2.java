package ex_08_Funcation;

public class Lab033_Smiple_method_2 {
    public static void main(String[] args) {
        int Result =retun_sum();
        float Result1=retun_float();
        boolean Result2=retun_boolen();
        byte Result3=return_bute();

        System.out.println(Result);
        System.out.println(Result1);
        System.out.println(Result2);
        System.out.println(Result3);
    }

    static int retun_sum(){
        return 2;
    }

    static float retun_float(){
        return 3.14f;
    }

    static boolean retun_boolen(){
        return true;
    }

    static byte return_bute(){
        return  102;
    }


}
