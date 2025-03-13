package ex_05_Ternary_operator;

public class Lab022_Grade_calc_ParseInt {
    public static void main(String[] args) {
        String FinalResult =args[0];
        int Marks = Integer.parseInt(FinalResult);

        String grade=(Marks>=90 && Marks<=100) ? "A":(Marks>=80 && Marks<=89) ? "B"
                :(Marks>=70 && Marks<=79)? "C" :(Marks>=60 && Marks<=59)? "D":(Marks>=0 && Marks<=59) ?"F":"NO Result";
        System.out.println("The Student Grade is :"+grade);


    }
}

//Write a program that calculates and displays the letter
//grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
