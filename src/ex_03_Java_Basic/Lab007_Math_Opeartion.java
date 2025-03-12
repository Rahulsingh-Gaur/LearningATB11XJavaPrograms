package ex_03_Java_Basic;

public class Lab007_Math_Opeartion {
    public static void main(String[] args) {
        double x = 10 ,x1 =2 ,x2;
        double y= 10, y1=2;
        double z= -10;

        double Result = (Math.pow(x,x1)) + (Math.pow(y,y1));
        double Cube_root= Result+z;
        double Final_Result= Math.cbrt(Cube_root);
        System.out.printf("The Final Result CubeRoot is %.2f",Final_Result);

        //another way out
//        double Result =(Math.cbrt(Math.pow(x,x1)+(Math.pow(y,y1))-Math.abs(z)));
//        System.out.println("New Result is " + Result);


    }
}
