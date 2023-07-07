package Case_study.menu;


import java.util.Scanner;

public class UserMenu {
    public void showMenu(Scanner scanner) {
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
                System.out.println("Invalid choice! Please try again.");
                showMenu(scanner);
                break;
        }
    }
}

