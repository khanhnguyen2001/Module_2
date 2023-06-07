package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_5_Tim_GTNN_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        final int SIZE = 5;
        int[] array = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 3: Gán phần tử đầu tiên là giá trị nhỏ nhất
        int minElement = array[0];

        // Bước 4: Duyệt mảng và tìm giá trị nhỏ nhất
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }

        // Bước 5: In ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minElement);

    }
}
