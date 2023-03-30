// 20. Write a Java program to test if an array contains a specific value.
public class Program_20 {

    public static void main(String[] args) {

        int[] array = {
                1415, 1920, 5688, 2921, 9099, 5697, 345 };

        System.out.println(contains(array,9099 ));
        System.out.println(contains(array, 340));

    }
    public static boolean contains(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}
