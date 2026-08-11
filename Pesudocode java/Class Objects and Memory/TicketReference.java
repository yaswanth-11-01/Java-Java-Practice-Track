
import java.util.Scanner;

class SupportTicket {

    int id;
    int priority;
    int waitingMinutes;
}

public class TicketReference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket ticket1 = new SupportTicket();
        System.out.print("Enter Ticket 1 (ID Priority WaitingMinutes): ");
        ticket1.id = sc.nextInt();
        ticket1.priority = sc.nextInt();
        ticket1.waitingMinutes = sc.nextInt();

        // Create and fill the second ticket
        SupportTicket ticket2 = new SupportTicket();
        System.out.print("Enter Ticket 2 (ID Priority WaitingMinutes): ");
        ticket2.id = sc.nextInt();
        ticket2.priority = sc.nextInt();
        ticket2.waitingMinutes = sc.nextInt();

        // Create and fill the third ticket
        SupportTicket ticket3 = new SupportTicket();
        System.out.print("Enter Ticket 3 (ID Priority WaitingMinutes): ");
        ticket3.id = sc.nextInt();
        ticket3.priority = sc.nextInt();
        ticket3.waitingMinutes = sc.nextInt();

        // Initially select the first ticket
        SupportTicket selected = ticket1;

        // Compare the second ticket with selected
        if (ticket2.priority > selected.priority
                || (ticket2.priority == selected.priority
                && ticket2.waitingMinutes > selected.waitingMinutes)
                || (ticket2.priority == selected.priority
                && ticket2.waitingMinutes == selected.waitingMinutes
                && ticket2.id < selected.id)) {

            selected = ticket2;
        }

        // Compare the third ticket with selected
        if (ticket3.priority > selected.priority
                || (ticket3.priority == selected.priority
                && ticket3.waitingMinutes > selected.waitingMinutes)
                || (ticket3.priority == selected.priority
                && ticket3.waitingMinutes == selected.waitingMinutes
                && ticket3.id < selected.id)) {

            selected = ticket3;
        }

        // Print the selected object's fields
        System.out.println("\n--- Result ---");
        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);

        sc.close();
    }
}
