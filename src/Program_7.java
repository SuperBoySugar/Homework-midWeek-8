import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 *  * Commission
 *  *  Sales amount >= 50,000 35%
 *  *  Sales amount >= 30,000 20%
 *  * >= 20,000 10%
 *  * >= 10,000 5%
 *  * < 10,000 2%
 */


public class Program_7 {


    public static void main(String[] args) {

        int salesid, salary;
        double salesamt, commision;
        String sellername;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        salesid = sc.nextInt();

        System.out.println("Enter Seller name: ");
        sellername = sc.next();

        System.out.println("Enter sales amount: ");
        salesamt = sc.nextDouble();

        System.out.println("Enter employee Salary: ");
        salary = sc.nextInt();
        sc.close();

        if (salesamt >=50000){
            System.out.println("Sales commision is: " + (commision = salesamt*0.35));
        } else if (salesamt>=30000 && salesamt<50000) {
            System.out.println("Sales commision is: " + (commision = salesamt*0.20));
        } else if (salesamt>=20000 && salesamt<30000) {
            System.out.println("Sales commision is: " + (commision = salesamt * 0.10));
        }else if (salesamt>=10000 && salesamt<20000) {
            System.out.println("Sales commission is: " + (commision = salesamt * 0.05));
        } else if (salesamt<10000) {
            System.out.println("Sales commission is: " + (commision = salesamt * 0.02));

        }
    }
}
