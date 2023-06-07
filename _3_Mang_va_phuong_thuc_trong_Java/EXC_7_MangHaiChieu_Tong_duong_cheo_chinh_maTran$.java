package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_7_MangHaiChieu_Tong_duong_cheo_chinh_maTran$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một ma trận vuông có sẵn
        double[][] matrix = {
                {1.2, 2.3, 3.4},
                {4.5, 5.6, 6.7},
                {7.8, 8.9, 9.0}
        };

        double diagonalSum = calculateDiagonalSum(matrix);

        System.out.println("Tổng các số trên đường chéo chính là: " + diagonalSum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
        System.out.print("Nhập kích thước ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] userInputMatrix = new double[size][size];

        System.out.println("Nhập giá trị cho các phần tử trong ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Phần tử ở hàng " + i + ", cột " + j + ": ");
                userInputMatrix[i][j] = scanner.nextDouble();
            }
        }

        diagonalSum = calculateDiagonalSum(userInputMatrix);

        System.out.println("Tổng các số trên đường chéo chính là: " + diagonalSum);
    }

    public static double calculateDiagonalSum(double[][] matrix) {
        double sum = 0.0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
