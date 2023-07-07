package Case_study.menu;

import java.util.Scanner;

public class AdminMenu {
    public void showMenu(Scanner scanner) {
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
                System.out.println("Invalid choice! Please try again.");
                showMenu(scanner);
                break;
        }
    }
}

