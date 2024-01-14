import java.util.Scanner;

class User {
    private String userId;
    private int userPin;

    public User(String userId, int userPin) {
        this.userId = userId;
        this.userPin = userPin;
    }

    public String getUserId() {
        return userId;
    }

    public int getUserPin() {
        return userPin;
    }
}

class TransactionHistory {
    // You can implement transaction history details here
}

class Withdraw {
    // You can implement withdrawal logic here
}

class Deposit {
    // You can implement deposit logic here
}

class Transfer {
    // You can implement transfer logic here
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dummy user for demo
        User user = new User("12345", 1234);

        System.out.println("Welcome to the ATM");
        System.out.print("Enter User ID: ");
        String enteredUserId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredUserId.equals(user.getUserId()) && enteredPin == user.getUserPin()) {
            System.out.println("Login successful!");

            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Call TransactionHistory class/method
                        break;
                    case 2:
                        // Call Withdraw class/method
                        break;
                    case 3:
                        // Call Deposit class/method
                        break;
                    case 4:
                        // Call Transfer class/method
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }
}
