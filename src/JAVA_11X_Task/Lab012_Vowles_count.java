package JAVA_11X_Task;

import java.util.Scanner;

public class Lab012_Vowles_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = scanner.nextLine().toLowerCase(); // Convert into lower case
        System.out.println(name);
        int legnth =name.length();
        System.out.println("Total leght:" +legnth);

        int vowelscount =0, consonantscount =0;
        for (int i=0;i<legnth;i++) {
            char CC = name.charAt(i); //charAt(i) is used to access each character in the string and check if it is a vowel or consonant.
            if (CC >= 'a' && CC <= 'z') {
                if (CC == 'a' || CC == 'e' || CC == 'i' || CC == 'o' || CC == 'u') {
                    vowelscount++;
                } else {
                    consonantscount++;
                }
            }

        }
            System.out.println("The Vowel count is :" +vowelscount);
            System.out.println("The Consonants count is :" +consonantscount);
        }







        }


//✅ Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4