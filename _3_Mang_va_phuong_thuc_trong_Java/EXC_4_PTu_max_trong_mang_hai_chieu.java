package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_4_PTu_max_trong_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Thu thập đầu vào từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        // Tạo ma trận với kích thước đã nhập
        double[][] matrix = new double[rows][columns];

        // Nhập giá trị cho từng phần tử của ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị của phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Bước 1: Tìm phần tử lớn nhất trong ma trận
        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        // Hiển thị tọa độ và giá trị của phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement);
        System.out.println("Nằm tại hàng " + (maxRow + 1) + ", cột " + (maxColumn + 1));
    }
}
