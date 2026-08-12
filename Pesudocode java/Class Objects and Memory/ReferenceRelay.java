
import java.util.Scanner;

class PracticeTask {

    int id;
}

public class ReferenceRelay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create three different PracticeTask objects
        PracticeTask first = new PracticeTask();
        PracticeTask second = new PracticeTask();
        PracticeTask third = new PracticeTask();

        // Read their IDs
        first.id = scanner.nextInt();
        second.id = scanner.nextInt();
        third.id = scanner.nextInt();

        // Preserve the first ID as a primitive int
        int unreachableId = first.id;

        // Create relay reference and assign first to it
        PracticeTask relay = first;

        // Assign second to first
        first = second;

        // Assign third to second
        second = third;

        // Assign second to relay
        relay = second;

        // Assign first to third
        third = first;

        // Print the final IDs reached by all four references
        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);

        // Print the ID of the unreachable object
        System.out.println("Unreachable Object: " + unreachableId);

        scanner.close();
    }
}
