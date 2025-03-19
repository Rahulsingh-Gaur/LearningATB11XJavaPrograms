package ex_07_Swithc_For_Loop;

public class Lab030_For_loop_with_switch {
    public static void main(String[] args) {

    for (int Day=8;Day<=8;Day++){

        switch (Day){
            case 1-> System.out.println("Its Monday");
            case 2-> System.out.println("Its Tuesday");
            case 3-> System.out.println("Its Wed");
            case 4-> System.out.println("Its Thursday");
            case 5-> System.out.println("Its Friday");
            case 6-> System.out.println("Its Sat");
            case 7-> System.out.println("Its Sun");
            default -> System.out.println("Invalid");
        }
    }
}}
