import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 *  * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

public class Program_10 {

    public static void calculation(char ch, int num1, int num2) {

        if (ch == '+') {
            System.out.println("\nAddition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Substraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
        }else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));
        }else if (ch == '/') {
            System.out.println("Devision of " + num1 + " / " + num2 + " = " + (num1 / num2));
        }else
            System.out.println("Operator is not available");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the operator yoa wnat (+, -, *, /");
        char ch = scan.next().charAt(0);

        calculation(ch, num1, num2);
    }
}
