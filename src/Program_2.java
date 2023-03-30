import java.util.Scanner;

/**2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Program_2 {

    public static void leapyear(int year){

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) !=0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input year to check leap year or not: ");
        int year = scan.nextInt();

        leapyear(year);
    }
}
