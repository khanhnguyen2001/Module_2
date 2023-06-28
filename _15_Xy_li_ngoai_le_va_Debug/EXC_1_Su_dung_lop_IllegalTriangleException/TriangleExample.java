package _15_Xy_li_ngoai_le_va_Debug.EXC_1_Su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài cạnh thứ nhất: ");
        int side1 = scanner.nextInt();
        System.out.println("Nhập vào độ dài cạnh thứ hai: ");
        int side2 = scanner.nextInt();
        System.out.println("Nhập vào độ dài cạnh thứ ba: ");
        int side3 = scanner.nextInt();

        try {
            checkTriangleValidity(side1, side2, side3);
            System.out.println("Tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            System.err.println("Xảy ra lỗi: " + e.getMessage());
        }
    }

    private static void checkTriangleValidity(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Độ dài cạnh phải là số dương");
        }

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }
}
