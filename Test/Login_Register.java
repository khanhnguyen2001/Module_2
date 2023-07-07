package Case_study;

import java.util.Scanner;

public class Login_Register {
    private static final int MAX_USERS = 100;
    private static String[] usernames = new String[MAX_USERS];
    private static String[] passwords = new String[MAX_USERS];
    private static String[] roles = new String[MAX_USERS];
    private static int userCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo sẵn tài khoản admin
        usernames[0] = "admin";
        passwords[0] = "admin123";
        roles[0] = "admin";
        userCount = 1;

        // Tạo sẵn tài khoản user
        usernames[1] = "user";
        passwords[1] = "user123";
        roles[1] = "user";
        userCount = 2;

        System.out.println("Home Page");
        System.out.println("1. Register");
        System.out.println("2. Login");

        int choice = 0;
        boolean isValidChoice = false;

        while (!isValidChoice) {
            System.out.print("Enter your choice (1 or 2): ");
            String input = scanner.next();

            try {
                choice = Integer.parseInt(input);
                if (choice == 1 || choice == 2) {
                    isValidChoice = true;
                } else {
                    System.out.println("Invalid choice! Please try again.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please try again.\n");
            }
        }

        if (choice == 1) {
            register(scanner);
        } else {
            login(scanner);
        }
    }

    private static void register(Scanner scanner) {
        System.out.println("Register");
        System.out.print("Enter username: ");
        String username = scanner.next();

        boolean isUsernameTaken = checkIfUsernameTaken(username);

        while (isUsernameTaken) {
            System.out.println("Username already exists! Please try again.\n");
            System.out.print("Enter username: ");
            username = scanner.next();
            isUsernameTaken = checkIfUsernameTaken(username);
        }

        System.out.print("Enter password: ");
        String password = scanner.next();

        System.out.print("Enter role (admin/user): ");
        String role = scanner.next();

        while (!role.equals("admin") && !role.equals("user")) {
            System.out.println("Invalid role! Please enter 'admin' or 'user'.\n");
            System.out.print("Enter role (admin/user): ");
            role = scanner.next();
        }

        usernames[userCount] = username;
        passwords[userCount] = password;
        roles[userCount] = role;
        userCount++;

        System.out.println("Registration successful!\n");

        login(scanner);
    }

    private static void login(Scanner scanner) {
        System.out.println("Login");
        System.out.print("Enter username: ");
        String inputUsername = scanner.next();

        System.out.print("Enter password: ");
        String inputPassword = scanner.next();

        int userIndex = findUser(inputUsername, inputPassword);

        if (userIndex != -1) {
            String role = roles[userIndex];
            if (role.equals("admin")) {
                adminMenu(scanner);
            } else {
                userMenu(scanner);
            }
        } else {
            System.out.println("Invalid username or password. Pleasetry again.\n");
            login(scanner);
        }
    }

    private static void adminMenu(Scanner scanner) {
        System.out.println("\n\nAdmin Menu\n");
        System.out.println("-----Menu-----\n" +
                "1. Quản lý nhập/ xuất kho hàng\n" +
                "2. Theo dõi số lượng tồn kho\n" +
                "3. Thêm sản phẩm\n" +
                "4. Sửa thông tin sản phẩm\n" +
                "5. Xóa sản phẩm\n" +
                "6. Tìm kiếm sản phẩm\n" +
                "7. Quản lý hóa đơn bán hàng\n" +
                "8. Thoát");

        int choice = scanner.nextInt();

        // Xử lý chức năng tương ứng với lựa chọn của người dùng
        switch (choice) {
            case 1:
                // Xử lý chức năng quản lý nhập/xuất kho hàng
                break;
            case 2:
                // Xử lý chức năng theo dõi số lượng tồn kho
                break;
            case 3:
                // Xử lý chức năng thêm sản phẩm
                break;
            case 4:
                // Xử lý chức năng sửa thông tin sản phẩm
                break;
            case 5:
                // Xử lý chức năng xóa sản phẩm
                break;
            case 6:
                // Xử lý chức năng tìm kiếm sản phẩm
                break;
            case 7:
                // Xử lý chức năng quản lý hóa đơn bán hàng
                break;
            case 8:
                // Thoát khỏi chương trình
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.\n");
                adminMenu(scanner);
                break;
        }
    }

    private static void userMenu(Scanner scanner) {
        System.out.println("\n\nUser Menu\n");
        System.out.println("---------Menu---------\n" +
                "1. Tạo hóa đơn bán hàng\n" +
                "2. Tìm kiếm sản phẩm\n" +
                "3. Theo dõi số lượng hàng tồn kho\n" +
                "4. Quản lý hóa đơn bán hàng\n" +
                "0. Thoát");

        int choice = scanner.nextInt();

        // Xử lý chức năng tương ứng với lựa chọn của người dùng
        switch (choice) {
            case 1:
                // Xử lý chức năng tạo hóa đơn bán hàng
                break;
            case 2:
                // Xử lý chức năng tìm kiếm sản phẩm
                break;
            case 3:
                // Xử lý chức năng theo dõi số lượng hàng tồn kho
                break;
            case 4:
                // Xử lý chức năng quản lý hóa đơn bán hàng
                break;
            case 0:
                // Thoát khỏi chương trình
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.\n");
                userMenu(scanner);
                break;
        }
    }

    private static boolean checkIfUsernameTaken(String username) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static int findUser(String username, String password) {
        for (int i = 0; i < userCount;i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return i;
            }
        }
        return -1;
    }
}


