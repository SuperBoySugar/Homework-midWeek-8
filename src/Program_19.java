import java.util.Scanner;

/**19. Write a Java program to calculate the average value of array elements
 */

public class Program_19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the value of Array: ");
        for (int i = 0; i < size; i++) {
            int value = scan.nextInt();
            array[i] = value;

        }
        int length = array.length;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / length;
        System.out.println("Average of array: " + average);
    }
}
