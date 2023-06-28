package _12_Java_Collection_Frameword.EXC_1_ArrayList_LinkedList_in_Java_Collection_FrameWord;

import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----- Quản lý Sản phẩm -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("----- Thêm sản phẩm -----");
                    System.out.print("Nhập ID sản phẩm: ");
                    int id = scanner.nextInt();
                    System.out.print("Nhập tên sản phẩm: ");
                    scanner.nextLine(); // Đọc bỏ dòng new line còn lại
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(id, name, price);
                    productManager.addProduct(product);
                    break;
                case 2:
                    System.out.println("----- Sửa thông tin sản phẩm -----");
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Nhập tên mới: ");
                    scanner.nextLine(); // Đọc bỏ dòng new line còn lại
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    productManager.updateProduct(updateId, newName, newPrice);
                    break;
                case 3:
                    System.out.println("----- Xoá sản phẩm -----");
                    System.out.print("Nhập ID sản phẩm cần xoá: ");
                    int deleteId = scanner.nextInt();
                    productManager.deleteProduct(deleteId);
                    break;
                case 4:
                    System.out.println("----- Danh sách sản phẩm -----");
                    productManager.displayProducts();
                    break;
                case 5:
                    System.out.println("----- Tìm kiếm sản phẩm theo tên -----");
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    scanner.nextLine(); // Đọc bỏ dòng new line còn lại
                    String searchName = scanner.nextLine();
                    productManager.searchProduct(searchName);
                    break;
                case 6:
                    System.out.println("----- Sắp xếp sản phẩm tăng dần theo giá -----");
                    productManager.sortProductsAscending();
                    break;
                case 7:
                    System.out.println("----- Sắp xếp sản phẩm giảm dần theo giá -----");
                    productManager.sortProductsDescending();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
