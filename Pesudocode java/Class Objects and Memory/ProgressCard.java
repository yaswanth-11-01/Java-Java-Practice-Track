
import java.util.Scanner;

class StudentProgress {

    String name;
    int completedLessons;
    int totalLessons;
    int percentage;
}

public class ProgressCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentProgress sp = new StudentProgress();

        System.out.print("Enter student name: ");
        sp.name = scanner.nextLine();
        System.out.print("Enter completed lessons: ");
        sp.completedLessons = scanner.nextInt();
        System.out.print("Enter total lessons: ");
        sp.totalLessons = scanner.nextInt();

        sp.percentage = sp.completedLessons * 100 / sp.totalLessons;

        System.out.println("Student: " + sp.name);
        System.out.println("Progress: " + sp.completedLessons + "/" + sp.totalLessons);
        System.out.println("Completion: " + sp.percentage + "%");
    }
}
