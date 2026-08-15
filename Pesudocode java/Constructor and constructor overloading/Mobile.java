import java.util.Scanner;

class MobileUnlock {

    void unlock(String pin) {
        if (pin.equals("1234")) {
            System.out.println("Mobile unlocked using PIN");
        } else {
            System.out.println("Wrong PIN");
        }
    }

    void unlock(int pattern) {
        if (pattern == 12369) {
            System.out.println("Mobile unlocked using Pattern");
        } else {
            System.out.println("Wrong Pattern");
        }
    }

    void unlock(String password, boolean isPassword) {
        if (password.equals("hello123")) {
            System.out.println("Mobile unlocked using Password");
        } else {
            System.out.println("Wrong Password");
        }
    }

    void unlock(boolean fingerprint, int type) {
        if (fingerprint) {
            System.out.println("Mobile unlocked using Fingerprint");
        } else {
            System.out.println("Fingerprint not recognized");
        }
    }

    void unlock(boolean faceMatch) {
        if (faceMatch) {
            System.out.println("Mobile unlocked using Face Lock");
        } else {
            System.out.println("Face not recognized");
        }
    }
}

public class Mobile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobileUnlock mobile = new MobileUnlock();

        System.out.println("1. PIN");
        System.out.println("2. Pattern");
        System.out.println("3. Password");
        System.out.println("4. Fingerprint");
        System.out.println("5. Face Lock");

        System.out.print("Choose unlock type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter PIN: ");
            String pin = sc.next();
            mobile.unlock(pin);

        } else if (choice == 2) {
            System.out.print("Enter Pattern: ");
            int pattern = sc.nextInt();
            mobile.unlock(pattern);

        } else if (choice == 3) {
            System.out.print("Enter Password: ");
            String password = sc.next();
            mobile.unlock(password, true);

        } else if (choice == 4) {
            System.out.print("Fingerprint recognized? (true/false): ");
            boolean fingerprint = sc.nextBoolean();
            mobile.unlock(fingerprint, 1);

        } else if (choice == 5) {
            System.out.print("Face recognized? (true/false): ");
            boolean face = sc.nextBoolean();
            mobile.unlock(face);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}