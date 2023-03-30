import java.util.Scanner;

/**
 * * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 *  * HRA = basic salary 10%
 *  * DA = Basic salary 8%
 *  * TA = Basic salary 9%
 *  * PF= Basic salary 20%
 *  * Gross salary = basic salary + HRA + TA + DA –PF
 *  * Print in following format  *
 *  * _______________________________
 *  * | Salary Slip |
 *  * |______________________________|
 *  * | Employee Id : 2564 |
 *  * | Employee Name : Jay |
 *  * |______________________________|
 *  * | Basic Salary : 25000.0 |
 *  * | HRA 10% : 2500.0 |
 *  * | TA 8% : 2250.0 |
 *  * | DA 9% : 2000.0 |
 *  * | PF - 20& : 5000.0 |
 *  * |______________________________|
 *  * | Gross Salary : 26750.0 |
 *  * |===========================|
 *
 *
 */


public class Program_5 {

    public static void main(String[] args) {

        double hra, ta, da, pf, grossalary;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee Id: ");
        int emid = scan.nextInt();

        System.out.println("Enter Employee name: ");
        String empname = scan.next();

        System.out.println("Enter employee salary: ");
        double basicsalary = scan.nextDouble();

        hra = (basicsalary * 10) / 100;
        ta = (basicsalary * 8) / 100;
        da = (basicsalary * 9) / 100;
        pf = (basicsalary * 20) / 100;

        grossalary = ((basicsalary + hra + ta + da) - (pf));

        System.out.println("|----------------------------------------------------------|");
        System.out.println("|                Salary Slip                               |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|  Employee Id     :       " + emid + "                    |");
        System.out.println("|  Employee Name     :       " + empname + "                    |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|  Basic Salary     :       " + basicsalary + "              |");
        System.out.println("|  HRA 10%      :           " + hra  + "                     |");
        System.out.println("|  TA 8%       :           " + ta  + "                       |");
        System.out.println("|  DA 9%       :           " + da  + "                       |");
        System.out.println("|  PF -20       :           " + pf  + "                      |");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|  Gross Salary    :           " + grossalary  + "               |");
        System.out.println("|--------------------------------------------------------------|");
    }

}
