import java.io.*;
import java.util.Scanner;

public class testFileCSV {
    private static final String ACCOUNT_FILE = "accounts.txt"; // File to store account info
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("[1] Create Account");
            System.out.println("[2] Login");
            System.out.println("[3] Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    // Method to create and save account information
    public static void createAccount() {
        String name, email, sex, address, password1, password2;
        double money;
        int phone;

        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Sex (Male/Female): ");
        sex = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Phone: ");
        phone = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Password confirmation
        do {
            System.out.print("Password: ");
            password1 = scanner.nextLine();
            System.out.print("Confirm Password: ");
            password2 = scanner.nextLine();
            if (!password1.equals(password2)) {
                System.out.println("Passwords do not match. Try again.");
            }
        } while (!password1.equals(password2));

        System.out.print("Initial Deposit: ");
        money = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        // Save account details to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ACCOUNT_FILE, true))) {
            writer.write(name + "," + email + "," + password1 + "," + sex + "," + address + "," + phone + "," + money);
            writer.newLine();
            System.out.println("Account created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to login by reading account information from file
    public static void login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(ACCOUNT_FILE))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] accountDetails = line.split(",");
                String storedEmail = accountDetails[1];
                String storedPassword = accountDetails[2];

                if (storedEmail.equals(email) && storedPassword.equals(password)) {
                    found = true;
                    System.out.println("Login successful!");
                    System.out.println("Account details:");
                    System.out.println("Name: " + accountDetails[0]);
                    System.out.println("Sex: " + accountDetails[3]);
                    System.out.println("Address: " + accountDetails[4]);
                    System.out.println("Phone: " + accountDetails[5]);
                    System.out.println("Balance: $" + accountDetails[6]);
                    break;
                }
            }

            if (!found) {
                System.out.println("Login failed: Invalid email or password.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
