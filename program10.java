/*Class definition, creating objects and constructors:
Write a java program to create a class named 'Bank ' with the following data
members:
• Name of depositor
• Address of depositor
• Account Number
• Balance in account
Class 'Bank' has a method for each of the following:
1. Generate a unique account number for each depositor.
2. For first depositor, account number will be 1001, for second depositor
it will be 1002 and so on
3. Display information and balance of depositor
4. Deposit more amount in balance of any depositor
5. Withdraw some amount from balance deposited.
6. Change address of depositor
2
After creating the class, do the following operations.
1. Enter the information (name, address, account number, balance) of the
depositors. Number of depositors is to be entered by the user.
2. Print the information of any depositor.
3. Add some amount to the account of any depositor and then display
final information of that depositor.
4. Remove some amount from the account of any.
depositor and then display final information of that depositor.
5. Change the address of any depositor and then display the final
information of that depositor.
6. Randomly repeat these processes for some other
bank accounts*/
import java.util.*;

class Bank {
    String name;
    String address;
    int accountNo;
    int balance;
    static int uniqueAccountNo = 1001;

    Bank(String name, String address, int balance) {
        this.name = name;
        this.address = address;
        this.accountNo = uniqueAccountNo++;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Name of depositor: " + name);
        System.out.println("Address of the depositor: " + address);
        System.out.println("Account number of the depositor: " + accountNo);
        System.out.println("Balance of the depositor: " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("New balance is: " + balance);
    }

    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient amount");
        } else {
            balance -= amount;
            System.out.println("New balance after withdrawal is: " + balance);
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
        System.out.println("New address is: " + address);
    }
}

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of depositors:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        Bank[] arr = new Bank[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the depositor " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter the address of the depositor " + (i + 1) + ":");
            String address = sc.nextLine();
            System.out.println("Enter the balance of the depositor " + (i + 1) + ":");
            int balance = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            arr[i] = new Bank(name, address, balance);
        }

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Display the information");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Change address");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.println("Enter the account number:");
            int accNo = sc.nextInt();
            Bank selectedBank = null;
            for (Bank bank : arr) {
                if (bank.accountNo == accNo) {
                    selectedBank = bank;
                    break;
                }
            }

            if (selectedBank == null) {
                System.out.println("Invalid account number.");
                continue;
            }

            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    selectedBank.display();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    int depositAmount = sc.nextInt();
                    selectedBank.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    selectedBank.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter the new address:");
                    String newAddress = sc.nextLine();
                    selectedBank.changeAddress(newAddress);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        sc.close();
    }
}
