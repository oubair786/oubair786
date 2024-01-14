import java.util.Scanner;

public class Main{
    private static String username;
    private static String password;
    private static boolean isLoggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Online Examination System");
            System.out.println("1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    updateProfileAndPassword(scanner);
                    break;
                case 3:
                    if (isLoggedIn) {
                        startExam(scanner);
                    } else {
                        System.out.println("Please login first.");
                    }
                    break;
                case 4:
                    logout();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        username = scanner.nextLine();

        System.out.print("Enter password: ");
        password = scanner.nextLine();

        // Perform authentication logic here (e.g., check against a database)
        // For simplicity, let's assume a hardcoded username and password
        if ("oubair".equals(username) &&"oubair".equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void updateProfileAndPassword(Scanner scanner) {
        if (isLoggedIn) {
            System.out.println("Update profile and password logic here.");
        } else {
            System.out.println("Please login first.");
        }
    }

    private static void startExam(Scanner scanner) {
        // Implement exam logic here (e.g., showing questions, recording answers, timer, etc.)
        System.out.println("Exam started!");
    }

    private static void logout() {
        isLoggedIn = false;
        System.out.println("Logout successful.");
    }
}
