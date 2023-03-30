import java.util.Scanner;

/**
 * 9. Using Switch
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if  any other alphabet should be invalid entry
 */

public class Program_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character from A to F: ");
        char c = scanner.next().charAt(0);

        switch (c) {

            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bhavnagar");
                break;
            case 'C':
                System.out.println("Chotila");
                break;
            case 'D':
                System.out.println("Dakor");
                break;
            case 'E':
                System.out.println("Edar");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

}
