import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program_1 {

    public static void oddOrEven(int num) {

        String oddeven = (num % 2 == 0)? "Even" : "Odd";
        System.out.println(num + " is " + oddeven + " number ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check Odd or Even number: ");
        int num = scan.nextInt();

        oddOrEven(num);
    }
}
