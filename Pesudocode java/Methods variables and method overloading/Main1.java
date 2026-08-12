
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        // Return price multiplied by quantity
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        // Return subtotal plus delivery charge
        return subtotal + deliveryCharge;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        // Create one OrderCalculator object
        OrderCalculator calculator = new OrderCalculator();

        // Call both methods
        int subtotal = calculator.calculateSubtotal(price, quantity);
        int finalTotal = calculator.calculateFinalTotal(subtotal, deliveryCharge);

        // Print the returned values
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Final Total: " + finalTotal);

        scanner.close();
    }
}
