package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class EXC_3_Gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng 1
        System.out.println("Nhập giá trị cho các phần tử trong mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Bước 2: Nhập giá trị cho các phần tử trong mảng 2
        System.out.println("Nhập giá trị cho các phần tử trong mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[array1.length + array2.length];

        // Bước 4: Gán các phần tử của mảng 1 vào mảng 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Gán các phần tử của mảng 2 vào mảng 3, tính từ phần tử array3[array1.length]
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // In ra mảng thứ 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
