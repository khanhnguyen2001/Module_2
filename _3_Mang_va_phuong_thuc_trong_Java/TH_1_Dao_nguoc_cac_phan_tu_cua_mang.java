package _3_Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class TH_1_Dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng (tối đa là 20): ");
        int size = scanner.nextInt();

        if (size > 20) {
            System.out.println("Số lượng phần tử vượt quá giới hạn cho phép.");
            return;
        }

        int[] array = new int[size];

        System.out.println("Nhập lần lượt các phần tử của mảng:");

        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng trước khi đảo ngược:");
        printArray(array);

        reverseArray(array);

        System.out.println("Mảng sau khi đảo ngược:");
        printArray(array);
    }

    //Đảo ngược mảng
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    //Mảng trước khi đảo ngược
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


//        int size;
//        int[] array;
//
//        do {
//            System.out.println("Nhập vào kích thước mảng: ");
//            size = scanner.nextInt();
//            if (size > 20) {
//                System.out.println("Kích thước không hợp lệ: ");
//            }
//        } while (size > 20);
//
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ") ;
//            array[i] = sc.nextInt();
//            i++;
//        }
//
//        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//        for (int j = 0; j < array.length / 2; j++) {
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }
//        System.out.printf("\n%-20s%s", "Đảo ngược mảng: ", "");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
    }
}