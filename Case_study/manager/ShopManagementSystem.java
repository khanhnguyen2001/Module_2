package Case_study.manager;

import Case_study.entity.Login;
import Case_study.menu.AdminMenu;
import Case_study.menu.UserMenu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopManagementSystem {
    private static final int MAX_USERS = 100;
    private Map<String, Login> users;
    private int userCount;

    public ShopManagementSystem() {
        users = new HashMap<>();
        userCount = 0;
        // Tạo sẵn tài khoản admin
        registerUser("admin", "admin123", "admin");
        // Tạo sẵn tài khoản user
        registerUser("user", "user123", "user");
    }

    public void registerUser(String username, String password, String role) {
        Login user = new Login(username, password, role);
        users.put(username, user);
        userCount++;
    }

    public void registerUser(Scanner scanner) {
        System.out.println("Register");
        System.out.print("Enter username: ");
        String username = scanner.next();

        boolean isUsernameTaken = users.containsKey(username);

        while (isUsernameTaken) {
            System.out.println("Username already exists! Please try again.");
            System.out.print("Enter username: ");
            username = scanner.next();
            isUsernameTaken = users.containsKey(username);
        }

        System.out.print("Enter password: ");
        String password = scanner.next();

        System.out.print("Enter role (admin/user): ");
        String role = scanner.next();

        while (!role.equals("admin") && !role.equals("user")) {
            System.out.println("Invalid role! Please enter 'admin' or 'user'.");
            System.out.print("Enter role (admin/user): ");
            role = scanner.next();
        }

        registerUser(username, password, role);

        System.out.println("Registration successful!");

        loginUser(scanner);
    }

    public void loginUser(Scanner scanner) {
        System.out.println("Login");
        System.out.print("Enter username: ");
        String inputUsername = scanner.next();

        System.out.print("Enter password: ");
        String inputPassword = scanner.next();

        Login user = users.get(inputUsername);

        if (user != null && user.getPassword().equals(inputPassword)) {
            if (user.getRole().equals("admin")) {
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.showMenu(scanner);
            } else {
                UserMenu userMenu = new UserMenu();
                userMenu.showMenu(scanner);
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
            loginUser(scanner);
        }
    }
}

