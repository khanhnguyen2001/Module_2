package _1_Introduction;

import java.util.Scanner;

public class TH_3_Using_the_operator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Nhập chiều dài: ");
        height = scanner.nextFloat(); //Nhập chiều dài

        float area = width * height;

        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
