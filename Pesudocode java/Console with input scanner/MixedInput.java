
import java.util.Scanner;

public class MixedInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Age must be a valid integer.");
            scanner.close();
            return;
        }
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left over from nextInt()

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.println("\n--- Summary ---");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();
    }
}
