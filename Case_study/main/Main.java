package Case_study.main;

import Case_study.manager.ShopManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopManagementSystem shop = new ShopManagementSystem();

        System.out.println("Home Page");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");

        int choice = 0;
        boolean isValidChoice = false;

        while (!isValidChoice) {
            System.out.print("Enter your choice (1, 2 or 3): ");
            String input = scanner.next();

            try {
                choice = Integer.parseInt(input);
                if (choice == 1 || choice == 2 || choice == 3) {
                    isValidChoice = true;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        if (choice == 1) {
            shop.registerUser(scanner);
        } else if (choice == 2) {
            shop.loginUser(scanner);
        }
        else {
            System.out.println("Exiting the program...");
            System.exit(0);
        }
    }
}

