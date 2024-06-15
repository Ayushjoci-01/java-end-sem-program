/*Write a java program to accept and print the employee details during runtime.
The details will include employee id, name, dept_ Id. The program should
raise an exception if user inputs incomplete or incorrect data. The entered
value should meet the following conditions:
a. First Letter of employee name should be in capital letter.
b. Employee id should be between 2001 and 5001
c. Department id should be an integer between 1 and 5.
If the above conditions are not met, then the application should raise specific
exception else should complete normal execution.*/
import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}

class InvalidDepIdException extends Exception {
    public InvalidDepIdException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    int id;
    int depId;

    public Employee(int id, String name, int depId) {
        this.id = id;
        this.name = name;
        this.depId = depId;
    }

    public int getEmployeeId() {
        return id;
    }

    public int getDepId() {
        return depId;
    }

    public String getEmployeeName() {
        return name;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", depId=" + depId + "]";
    }
}

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter employee ID (between 2001 and 5001): ");
            int empId = sc.nextInt();
            if (empId < 2001 || empId > 5001) {
                throw new InvalidIdException("Invalid employee ID");
            }

            System.out.print("Enter employee name (first letter in capital): ");
            String empName = sc.next();
            if (!Character.isUpperCase(empName.charAt(0))) {
                throw new InvalidNameException("Invalid employee name");
            }

            System.out.print("Enter department ID (between 1 and 5): ");
            int depId = sc.nextInt();
            if (depId < 1 || depId > 5) {
                throw new InvalidDepIdException("Invalid department ID");
            }

            Employee emp = new Employee(empId, empName, depId);
            System.out.println("Employee details: " + emp);
        } catch (InvalidIdException | InvalidNameException | InvalidDepIdException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
