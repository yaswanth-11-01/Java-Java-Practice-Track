import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int[] planned = new int[days];
        int[] completed = new int[days];

        // Read planned values
        for (int i = 0; i < days; i++) {
            planned[i] = scanner.nextInt();
        }

        // Read completed values
        for (int i = 0; i < days; i++) {
            completed[i] = scanner.nextInt();
        }

        int completedDays = 0;

        // Compare both arrays
        for (int i = 0; i < days; i++) {

            if (completed[i] >= planned[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                completedDays++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        System.out.println("Completed days: " + completedDays);
    }
}