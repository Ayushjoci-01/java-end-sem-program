/*Concepts of Java Control statements, Conditional statements, loops and
iterations, Wrapper classes, Scanner Class:
Using the switch statement, write a menu-driven program to calculate the
maturity amount of a bank deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit
For option (i) accept Principal (p), rate of interest (r) and time period in years
(n). Calculate and output the maturity amount (a) receivable using the formula
a = p[1 + r / 100]n.
For option (ii) accept monthly installment (p), rate of interest (r) and time period
in months (n). Calculate and output the maturity amount (a) receivable using
the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12. For an incorrect option,
an appropriate error message should be displayed.
[ Use Scanner Class to take input ]*/
import java.util.*;
public class program2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("enter the choice press 1 for term and press 2 for recurring deposite");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("enter the principal");
            int p=sc.nextInt();
            System.out.println("enter the rate");
            int r=sc.nextInt();
            System.out.println("enter the time");
            int t=sc.nextInt();
            double total= p* Math.pow((1 +r/100),t);
            System.out.println("total is"+total);  
                break;
            case 2:
          
                System.out.println("enter the principal");
                int p1=sc.nextInt();
                System.out.println("enter the rate");
                int r1=sc.nextInt();
                System.out.println("enter the time");
                int t1=sc.nextInt();
                double total1 =  p1 * t1 + (p1 * t1 * (t1 + 1) / 2.0) * (r1 / 100) * (1 / 12.0);
                System.out.println("total is"+total1);
                break;
            default:
            System.out.println("invalid case");
                break;
        }


    }
}
