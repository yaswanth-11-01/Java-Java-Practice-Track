import java.util.Scanner;

class Employee {
    String name;
    String role;

    Employee() {
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read employee name
        String name = scanner.next();

        // Create exactly one object
        Employee employee = new Employee();

        // Store name in object's field
        employee.name = name;

        // Display profile
        employee.displayProfile();
    }
}