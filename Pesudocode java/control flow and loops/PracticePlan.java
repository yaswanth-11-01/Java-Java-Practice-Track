
public class PracticePlan {

    public static void main(String[] args) {
        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        for (int day = 1; day <= practiceDays; day++) {
            if (day == revisionDay) {
                continue;
            }

            for (int session = 1; session <= sessionsPerDay; session++) {

                if (day == practiceDays && session > finalDaySessionLimit) {
                    break;
                }

                System.out.println("Day " + day + " - Session " + session);
                completedSessions++;
            }
        }

        System.out.println("Completed Sessions: " + completedSessions);

        if (completedSessions >= targetSessions) {
            System.out.println("Target Achieved");
        } else {
            System.out.println("Target pending");
        }
    }
}
