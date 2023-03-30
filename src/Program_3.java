//**  Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks

import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {

        String result, grade = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        String stuname = scan.next();

        System.out.println("Enter Student roll no: ");
        int rollno = scan.nextInt();

        System.out.println("Enter marks for Maths: ");
        int maths = scan.nextInt();
        while (maths> 100 || maths < 0){
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            maths = scan.nextInt();
        }
        System.out.println("Enter marks for Science: ");
        int science = scan.nextInt();
        while (science > 100 || science < 0) {
            System.out.println("Invalid input, Science marks should be between 0 to 100");
            science = scan.nextInt();
        }
        System.out.println("Enter marks for English: ");
        int english = scan.nextInt();
        while (english > 100 || english < 0);
        {
            System.out.println("Invalid input, English marks should be between 0 to 100 ");
            english = scan.nextInt();
        }
        float total = maths + science + english;
        System.out.println("Total marks for Maths + Science + English is: " + total);

        float percentage = total / 300 * 100;
        System.out.println("Percentage of all three subject is: " + percentage);

        if (percentage >= 35){
            result = "Pass";
        }else {
            result = "Fail";
        }
        System.out.println(result);

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade: " + grade);
        }else {
            grade = "";
        }
        System.out.println("|---------------------------------|");
        System.out.println("|        Mark Sheet               |");
        System.out.println("|---------------------------------|");
        System.out.println("| Name:         " + stuname +  "  |");
        System.out.println("| Roll No:         " + rollno +  "|");
        System.out.println("|---------------------------------|");
        System.out.println("| Subjects           Marks        |");
        System.out.println("|---------------------------------|");
        System.out.println("| Maths             " + maths + " |");
        System.out.println("| Science           " + science +"|");
        System.out.println("| English           " + english +"|");
        System.out.println("|---------------------------------|");
        System.out.println("| Total:            " + total + " |");
        System.out.println("|---------------------------------|");
        System.out.println("| Percentage:    " + percentage + "|");
        System.out.println("| Result:        " + result + "    |");
        System.out.println("| Grade:        " + grade + "      |");
        System.out.println("|----------------------------------|");
    }
        }




