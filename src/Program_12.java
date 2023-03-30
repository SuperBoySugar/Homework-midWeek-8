import java.util.Scanner;

/**
 *  12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program_12 {

    public static void checkValue(char ch) {

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println("Entered character is Alphabet");

        else if (ch >= 48 && ch <= 122)
            System.out.println("Entered character is Digit");

            else
            System.out.println("Entered character is special character");

        }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value to check Alphabet or Digit or special character:");
        char ch = scan.next().charAt(0);
        checkValue(ch);
    }
}
