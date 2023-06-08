package _4_Lop_va_doi_tuong_trong_Java.TH_1_Lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai: ");
        double width = scanner.nextDouble();

        System.out.println("Nhap chieu rong: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Hinh chu nhat cua ban\n" + rectangle.display());
        System.out.println("Chu vi cua hinh chu nhat: " + rectangle.getPerimeter());
        System.out.println("Dien tich cua hinh chu nhat: " + rectangle.getArea());
    }
}
