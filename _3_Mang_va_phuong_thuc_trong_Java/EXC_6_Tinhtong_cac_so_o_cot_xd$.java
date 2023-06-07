package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_6_Tinhtong_cac_so_o_cot_xd$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một mảng có sẵn
        double[][] array = {
                {1.2, 2.3, 3.4},
                {4.5, 5.6, 6.7},
                {7.8, 8.9, 9.0}
        };
        int column = 1; // Thứ tự cột cần tính tổng (tính từ 0)

        double columnSum = calculateColumnSum(array, column);

        System.out.println("Tổng các phần tử của cột " + column + " là: " + columnSum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] userInputArray = new double[rows][cols];

        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử ở hàng " + i + ", cột " + j + ": ");
                userInputArray[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập thứ tự của cột cần tính tổng: ");
        column = scanner.nextInt();

        columnSum = calculateColumnSum(userInputArray, column);

        System.out.println("Tổng các phần tử của cột " + column + " là: " + columnSum);
    }

    public static double calculateColumnSum(double[][] array, int column) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }

        return sum;
    }
}
